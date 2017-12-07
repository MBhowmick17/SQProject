
import java.io.*;
import java.util.*;
import javamoprt.*;
import java.lang.ref.*;
import org.aspectj.lang.*;

class ReturnBooksBeforeIssueMonitor_Set extends javamoprt.MOPSet {
	protected ReturnBooksBeforeIssueMonitor[] elementData;

	public ReturnBooksBeforeIssueMonitor_Set(){
		this.size = 0;
		this.elementData = new ReturnBooksBeforeIssueMonitor[4];
	}

	public final int size(){
		while(size > 0 && elementData[size-1].MOP_terminated) {
			elementData[--size] = null;
		}
		return size;
	}

	public final boolean add(MOPMonitor e){
		ensureCapacity();
		elementData[size++] = (ReturnBooksBeforeIssueMonitor)e;
		return true;
	}

	public final void endObject(int idnum){
		int numAlive = 0;
		for(int i = 0; i < size; i++){
			ReturnBooksBeforeIssueMonitor monitor = elementData[i];
			if(!monitor.MOP_terminated){
				monitor.endObject(idnum);
			}
			if(!monitor.MOP_terminated){
				elementData[numAlive++] = monitor;
			}
		}
		for(int i = numAlive; i < size; i++){
			elementData[i] = null;
		}
		size = numAlive;
	}

	public final boolean alive(){
		for(int i = 0; i < size; i++){
			MOPMonitor monitor = elementData[i];
			if(!monitor.MOP_terminated){
				return true;
			}
		}
		return false;
	}

	public final void endObjectAndClean(int idnum){
		int size = this.size;
		this.size = 0;
		for(int i = size - 1; i >= 0; i--){
			MOPMonitor monitor = elementData[i];
			if(monitor != null && !monitor.MOP_terminated){
				monitor.endObject(idnum);
			}
			elementData[i] = null;
		}
		elementData = null;
	}

	public final void ensureCapacity() {
		int oldCapacity = elementData.length;
		if (size + 1 > oldCapacity) {
			cleanup();
		}
		if (size + 1 > oldCapacity) {
			ReturnBooksBeforeIssueMonitor[] oldData = elementData;
			int newCapacity = (oldCapacity * 3) / 2 + 1;
			if (newCapacity < size + 1){
				newCapacity = size + 1;
			}
			elementData = Arrays.copyOf(oldData, newCapacity);
		}
	}

	public final void cleanup() {
		int numAlive = 0 ;
		for(int i = 0; i < size; i++){
			ReturnBooksBeforeIssueMonitor monitor = (ReturnBooksBeforeIssueMonitor)elementData[i];
			if(!monitor.MOP_terminated){
				elementData[numAlive] = monitor;
				numAlive++;
			}
		}
		for(int i = numAlive; i < size; i++){
			elementData[i] = null;
		}
		size = numAlive;
	}

	public final void event_bookIssued() {
		int numAlive = 0 ;
		for(int i = 0; i < this.size; i++){
			ReturnBooksBeforeIssueMonitor monitor = (ReturnBooksBeforeIssueMonitor)this.elementData[i];
			if(!monitor.MOP_terminated){
				elementData[numAlive] = monitor;
				numAlive++;

				monitor.Prop_1_event_bookIssued();
				if(monitor.Prop_1_Category_fail) {
					monitor.Prop_1_handler_fail();
				}
			}
		}
		for(int i = numAlive; i < this.size; i++){
			this.elementData[i] = null;
		}
		size = numAlive;
	}

	public final void event_bookReturn() {
		int numAlive = 0 ;
		for(int i = 0; i < this.size; i++){
			ReturnBooksBeforeIssueMonitor monitor = (ReturnBooksBeforeIssueMonitor)this.elementData[i];
			if(!monitor.MOP_terminated){
				elementData[numAlive] = monitor;
				numAlive++;

				monitor.Prop_1_event_bookReturn();
				if(monitor.Prop_1_Category_fail) {
					monitor.Prop_1_handler_fail();
				}
			}
		}
		for(int i = numAlive; i < this.size; i++){
			this.elementData[i] = null;
		}
		size = numAlive;
	}
}

class ReturnBooksBeforeIssueMonitor extends javamoprt.MOPMonitor implements Cloneable, javamoprt.MOPObject {
	public Object clone() {
		try {
			ReturnBooksBeforeIssueMonitor ret = (ReturnBooksBeforeIssueMonitor) super.clone();
			return ret;
		}
		catch (CloneNotSupportedException e) {
			throw new InternalError(e.toString());
		}
	}

	int Prop_1_state;
	static final int Prop_1_transition_bookIssued[] = {1, 3, 3, 3};;
	static final int Prop_1_transition_bookReturn[] = {3, 2, 3, 3};;

	boolean Prop_1_Category_fail = false;

	public ReturnBooksBeforeIssueMonitor () {
		Prop_1_state = 0;

	}

	public final void Prop_1_event_bookIssued() {
		MOP_lastevent = 0;

		Prop_1_state = Prop_1_transition_bookIssued[Prop_1_state];
		Prop_1_Category_fail = Prop_1_state == 3;
		{
			System.out.print("Issued books testing");
		}
	}

	public final void Prop_1_event_bookReturn() {
		MOP_lastevent = 1;

		Prop_1_state = Prop_1_transition_bookReturn[Prop_1_state];
		Prop_1_Category_fail = Prop_1_state == 3;
		{
			System.out.print("Return books testing");
		}
	}

	public final void Prop_1_handler_fail (){
		{
			System.err.println("! It's not legal here to return books before issue.");
			this.reset();
		}

	}

	public final void reset() {
		MOP_lastevent = -1;
		Prop_1_state = 0;
		Prop_1_Category_fail = false;
	}

	public final void endObject(int idnum){
		switch(idnum){
		}
		switch(MOP_lastevent) {
			case -1:
			return;
			case 0:
			//bookIssued
			return;
			case 1:
			//bookReturn
			return;
		}
		return;
	}

}

public aspect ReturnBooksBeforeIssueMonitorAspect implements javamoprt.MOPObject {
	javamoprt.map.MOPMapManager ReturnBooksBeforeIssueMapManager;
	public ReturnBooksBeforeIssueMonitorAspect(){
		ReturnBooksBeforeIssueMapManager = new javamoprt.map.MOPMapManager();
		ReturnBooksBeforeIssueMapManager.start();
	}

	// Declarations for the Lock
	static Object ReturnBooksBeforeIssue_MOPLock = new Object();

	static boolean ReturnBooksBeforeIssue_activated = false;

	// Declarations for Indexing Trees
	static ReturnBooksBeforeIssueMonitor ReturnBooksBeforeIssue_Monitor = new ReturnBooksBeforeIssueMonitor();

	// Trees for References

	pointcut MOP_CommonPointCut() : !within(javamoprt.MOPObject+) && !adviceexecution();
	pointcut ReturnBooksBeforeIssue_bookIssued() : (call(public void IssueBookForm.issuedBooks())) && MOP_CommonPointCut();
	after () : ReturnBooksBeforeIssue_bookIssued() {
		ReturnBooksBeforeIssue_activated = true;
		synchronized(ReturnBooksBeforeIssue_MOPLock) {
			ReturnBooksBeforeIssueMonitor mainMonitor = null;

			mainMonitor = ReturnBooksBeforeIssue_Monitor;

			if (mainMonitor == null) {
				mainMonitor = new ReturnBooksBeforeIssueMonitor();

				ReturnBooksBeforeIssue_Monitor = mainMonitor;
			}

			mainMonitor.Prop_1_event_bookIssued();
			if(mainMonitor.Prop_1_Category_fail) {
				mainMonitor.Prop_1_handler_fail();
			}
		}
	}

	pointcut ReturnBooksBeforeIssue_bookReturn() : (call(public void ReturnBook.returnBook())) && MOP_CommonPointCut();
	before () : ReturnBooksBeforeIssue_bookReturn() {
		ReturnBooksBeforeIssue_activated = true;
		synchronized(ReturnBooksBeforeIssue_MOPLock) {
			ReturnBooksBeforeIssueMonitor mainMonitor = null;

			mainMonitor = ReturnBooksBeforeIssue_Monitor;

			if (mainMonitor == null) {
				mainMonitor = new ReturnBooksBeforeIssueMonitor();

				ReturnBooksBeforeIssue_Monitor = mainMonitor;
			}

			mainMonitor.Prop_1_event_bookReturn();
			if(mainMonitor.Prop_1_Category_fail) {
				mainMonitor.Prop_1_handler_fail();
			}
		}
	}

}
