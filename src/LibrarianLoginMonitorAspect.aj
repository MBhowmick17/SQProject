
import java.io.*;
import java.util.*;
import javamoprt.*;
import java.lang.ref.*;
import org.aspectj.lang.*;

class LibrarianLoginMonitor_Set extends javamoprt.MOPSet {
	protected LibrarianLoginMonitor[] elementData;

	public LibrarianLoginMonitor_Set(){
		this.size = 0;
		this.elementData = new LibrarianLoginMonitor[4];
	}

	public final int size(){
		while(size > 0 && elementData[size-1].MOP_terminated) {
			elementData[--size] = null;
		}
		return size;
	}

	public final boolean add(MOPMonitor e){
		ensureCapacity();
		elementData[size++] = (LibrarianLoginMonitor)e;
		return true;
	}

	public final void endObject(int idnum){
		int numAlive = 0;
		for(int i = 0; i < size; i++){
			LibrarianLoginMonitor monitor = elementData[i];
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
			LibrarianLoginMonitor[] oldData = elementData;
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
			LibrarianLoginMonitor monitor = (LibrarianLoginMonitor)elementData[i];
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

	public final void event_wrongLoginMessageShow() {
		int numAlive = 0 ;
		for(int i = 0; i < this.size; i++){
			LibrarianLoginMonitor monitor = (LibrarianLoginMonitor)this.elementData[i];
			if(!monitor.MOP_terminated){
				elementData[numAlive] = monitor;
				numAlive++;

				monitor.Prop_1_event_wrongLoginMessageShow();
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

class LibrarianLoginMonitor extends javamoprt.MOPMonitor implements Cloneable, javamoprt.MOPObject {
	public Object clone() {
		try {
			LibrarianLoginMonitor ret = (LibrarianLoginMonitor) super.clone();
			return ret;
		}
		catch (CloneNotSupportedException e) {
			throw new InternalError(e.toString());
		}
	}

	int Prop_1_state;
	static final int Prop_1_transition_wrongLoginMessageShow[] = {2, 3, 1, 3};;

	boolean Prop_1_Category_fail = false;

	public LibrarianLoginMonitor () {
		Prop_1_state = 0;

	}

	public final void Prop_1_event_wrongLoginMessageShow() {
		MOP_lastevent = 0;

		Prop_1_state = Prop_1_transition_wrongLoginMessageShow[Prop_1_state];
		Prop_1_Category_fail = Prop_1_state == 3;
		{
			System.out.print("Librarian login testing");
		}
	}

	public final void Prop_1_handler_fail (){
		{
			System.err.println("! It's really annoying to put error message thrice.");
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
			//wrongLoginMessageShow
			return;
		}
		return;
	}

}

public aspect LibrarianLoginMonitorAspect implements javamoprt.MOPObject {
	javamoprt.map.MOPMapManager LibrarianLoginMapManager;
	public LibrarianLoginMonitorAspect(){
		LibrarianLoginMapManager = new javamoprt.map.MOPMapManager();
		LibrarianLoginMapManager.start();
	}

	// Declarations for the Lock
	static Object LibrarianLogin_MOPLock = new Object();

	static boolean LibrarianLogin_activated = false;

	// Declarations for Indexing Trees
	static LibrarianLoginMonitor LibrarianLogin_Monitor = new LibrarianLoginMonitor();

	// Trees for References

	pointcut MOP_CommonPointCut() : !within(javamoprt.MOPObject+) && !adviceexecution();
	pointcut LibrarianLogin_wrongLoginMessageShow() : (call(public void LibrarianLogin.wrongLoginMessageShow())) && MOP_CommonPointCut();
	after () : LibrarianLogin_wrongLoginMessageShow() {
		LibrarianLogin_activated = true;
		synchronized(LibrarianLogin_MOPLock) {
			LibrarianLoginMonitor mainMonitor = null;

			mainMonitor = LibrarianLogin_Monitor;

			if (mainMonitor == null) {
				mainMonitor = new LibrarianLoginMonitor();

				LibrarianLogin_Monitor = mainMonitor;
			}

			mainMonitor.Prop_1_event_wrongLoginMessageShow();
			if(mainMonitor.Prop_1_Category_fail) {
				mainMonitor.Prop_1_handler_fail();
			}
		}
	}

}
