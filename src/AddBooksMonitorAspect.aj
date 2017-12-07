
import java.io.*;
import java.util.*;
import javamoprt.*;
import java.lang.ref.*;
import org.aspectj.lang.*;

class AddBooksMonitor_Set extends javamoprt.MOPSet {
	protected AddBooksMonitor[] elementData;

	public AddBooksMonitor_Set(){
		this.size = 0;
		this.elementData = new AddBooksMonitor[4];
	}

	public final int size(){
		while(size > 0 && elementData[size-1].MOP_terminated) {
			elementData[--size] = null;
		}
		return size;
	}

	public final boolean add(MOPMonitor e){
		ensureCapacity();
		elementData[size++] = (AddBooksMonitor)e;
		return true;
	}

	public final void endObject(int idnum){
		int numAlive = 0;
		for(int i = 0; i < size; i++){
			AddBooksMonitor monitor = elementData[i];
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
			AddBooksMonitor[] oldData = elementData;
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
			AddBooksMonitor monitor = (AddBooksMonitor)elementData[i];
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
			AddBooksMonitor monitor = (AddBooksMonitor)this.elementData[i];
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
}

class AddBooksMonitor extends javamoprt.MOPMonitor implements Cloneable, javamoprt.MOPObject {
	public Object clone() {
		try {
			AddBooksMonitor ret = (AddBooksMonitor) super.clone();
			return ret;
		}
		catch (CloneNotSupportedException e) {
			throw new InternalError(e.toString());
		}
	}

	int Prop_1_state;
	static final int Prop_1_transition_bookAdded[] = {2, 3, 1, 3};;

	boolean Prop_1_Category_fail = false;

	public AddBooksMonitor () {
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

	public final void Prop_1_handler_fail (){
		{
			System.err.println("! It's not legal here to add books sequentially.");
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
		}
		return;
	}

}

public aspect AddBooksMonitorAspect implements javamoprt.MOPObject {
	javamoprt.map.MOPMapManager AddBooksMapManager;
	public AddBooksMonitorAspect(){
		AddBooksMapManager = new javamoprt.map.MOPMapManager();
		AddBooksMapManager.start();
	}

	// Declarations for the Lock
	static Object AddBooks_MOPLock = new Object();

	static boolean AddBooks_activated = false;

	// Declarations for Indexing Trees
	static AddBooksMonitor AddBooks_Monitor = new AddBooksMonitor();

	// Trees for References

	pointcut MOP_CommonPointCut() : !within(javamoprt.MOPObject+) && !adviceexecution();
	pointcut AddBooks_bookAdded() : (call(public void BooksForm.bookAdded())) && MOP_CommonPointCut();
	after () : AddBooks_bookAdded() {
		AddBooks_activated = true;
		synchronized(AddBooks_MOPLock) {
			AddBooksMonitor mainMonitor = null;

			mainMonitor = AddBooks_Monitor;

			if (mainMonitor == null) {
				mainMonitor = new AddBooksMonitor();

				AddBooks_Monitor = mainMonitor;
			}

			mainMonitor.Prop_1_event_bookAdded();
			if(mainMonitor.Prop_1_Category_fail) {
				mainMonitor.Prop_1_handler_fail();
			}
		}
	}

}
