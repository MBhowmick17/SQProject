
import java.io.*;
import java.util.*;
import javamoprt.*;
import java.lang.ref.*;
import org.aspectj.lang.*;

class IssueBooksBeforeAddingMonitor_Set extends javamoprt.MOPSet {
	protected IssueBooksBeforeAddingMonitor[] elementData;

	public IssueBooksBeforeAddingMonitor_Set(){
		this.size = 0;
		this.elementData = new IssueBooksBeforeAddingMonitor[4];
	}

	public final int size(){
		while(size > 0 && elementData[size-1].MOP_terminated) {
			elementData[--size] = null;
		}
		return size;
	}

	public final boolean add(MOPMonitor e){
		ensureCapacity();
		elementData[size++] = (IssueBooksBeforeAddingMonitor)e;
		return true;
	}

	public final void endObject(int idnum){
		int numAlive = 0;
		for(int i = 0; i < size; i++){
			IssueBooksBeforeAddingMonitor monitor = elementData[i];
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
			IssueBooksBeforeAddingMonitor[] oldData = elementData;
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
			IssueBooksBeforeAddingMonitor monitor = (IssueBooksBeforeAddingMonitor)elementData[i];
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

	public final void event_bookAdded() {
		int numAlive = 0 ;
		for(int i = 0; i < this.size; i++){
			IssueBooksBeforeAddingMonitor monitor = (IssueBooksBeforeAddingMonitor)this.elementData[i];
			if(!monitor.MOP_terminated){
				elementData[numAlive] = monitor;
				numAlive++;

				monitor.Prop_1_event_bookAdded();
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

	public final void event_bookIssued() {
		int numAlive = 0 ;
		for(int i = 0; i < this.size; i++){
			IssueBooksBeforeAddingMonitor monitor = (IssueBooksBeforeAddingMonitor)this.elementData[i];
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
}

class IssueBooksBeforeAddingMonitor extends javamoprt.MOPMonitor implements Cloneable, javamoprt.MOPObject {
	public Object clone() {
		try {
			IssueBooksBeforeAddingMonitor ret = (IssueBooksBeforeAddingMonitor) super.clone();
			return ret;
		}
		catch (CloneNotSupportedException e) {
			throw new InternalError(e.toString());
		}
	}

	int Prop_1_state;
	static final int Prop_1_transition_bookAdded[] = {1, 3, 3, 3};;
	static final int Prop_1_transition_bookIssued[] = {3, 2, 3, 3};;

	boolean Prop_1_Category_fail = false;

	public IssueBooksBeforeAddingMonitor () {
		Prop_1_state = 0;

	}

	public final void Prop_1_event_bookAdded() {
		MOP_lastevent = 0;

		Prop_1_state = Prop_1_transition_bookAdded[Prop_1_state];
		Prop_1_Category_fail = Prop_1_state == 3;
		{
			System.out.print("Add books testing");
		}
	}

	public final void Prop_1_event_bookIssued() {
		MOP_lastevent = 1;

		Prop_1_state = Prop_1_transition_bookIssued[Prop_1_state];
		Prop_1_Category_fail = Prop_1_state == 3;
		{
			System.out.print("Issued books testing");
		}
	}

	public final void Prop_1_handler_fail (){
		{
			System.err.println("! It's not legal here to issue books before adding.");
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
			//bookAdded
			return;
			case 1:
			//bookIssued
			return;
		}
		return;
	}

}

public aspect IssueBooksBeforeAddingMonitorAspect implements javamoprt.MOPObject {
	javamoprt.map.MOPMapManager IssueBooksBeforeAddingMapManager;
	public IssueBooksBeforeAddingMonitorAspect(){
		IssueBooksBeforeAddingMapManager = new javamoprt.map.MOPMapManager();
		IssueBooksBeforeAddingMapManager.start();
	}

	// Declarations for the Lock
	static Object IssueBooksBeforeAdding_MOPLock = new Object();

	static boolean IssueBooksBeforeAdding_activated = false;

	// Declarations for Indexing Trees
	static IssueBooksBeforeAddingMonitor IssueBooksBeforeAdding_Monitor = new IssueBooksBeforeAddingMonitor();

	// Trees for References

	pointcut MOP_CommonPointCut() : !within(javamoprt.MOPObject+) && !adviceexecution();
	pointcut IssueBooksBeforeAdding_bookAdded() : (call(public void BooksForm.bookAdded())) && MOP_CommonPointCut();
	after () : IssueBooksBeforeAdding_bookAdded() {
		IssueBooksBeforeAdding_activated = true;
		synchronized(IssueBooksBeforeAdding_MOPLock) {
			IssueBooksBeforeAddingMonitor mainMonitor = null;

			mainMonitor = IssueBooksBeforeAdding_Monitor;

			if (mainMonitor == null) {
				mainMonitor = new IssueBooksBeforeAddingMonitor();

				IssueBooksBeforeAdding_Monitor = mainMonitor;
			}

			mainMonitor.Prop_1_event_bookAdded();
			if(mainMonitor.Prop_1_Category_fail) {
				mainMonitor.Prop_1_handler_fail();
			}
		}
	}

	pointcut IssueBooksBeforeAdding_bookIssued() : (call(public void IssueBookForm.issuedBooks())) && MOP_CommonPointCut();
	before () : IssueBooksBeforeAdding_bookIssued() {
		IssueBooksBeforeAdding_activated = true;
		synchronized(IssueBooksBeforeAdding_MOPLock) {
			IssueBooksBeforeAddingMonitor mainMonitor = null;

			mainMonitor = IssueBooksBeforeAdding_Monitor;

			if (mainMonitor == null) {
				mainMonitor = new IssueBooksBeforeAddingMonitor();

				IssueBooksBeforeAdding_Monitor = mainMonitor;
			}

			mainMonitor.Prop_1_event_bookIssued();
			if(mainMonitor.Prop_1_Category_fail) {
				mainMonitor.Prop_1_handler_fail();
			}
		}
	}

}
