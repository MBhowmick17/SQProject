
import java.io.*;
import java.util.*;
import javamoprt.*;
import java.lang.ref.*;
import org.aspectj.lang.*;

class AdminLoginMonitor_Set extends javamoprt.MOPSet {
	protected AdminLoginMonitor[] elementData;

	public AdminLoginMonitor_Set(){
		this.size = 0;
		this.elementData = new AdminLoginMonitor[4];
	}

	public final int size(){
		while(size > 0 && elementData[size-1].MOP_terminated) {
			elementData[--size] = null;
		}
		return size;
	}

	public final boolean add(MOPMonitor e){
		ensureCapacity();
		elementData[size++] = (AdminLoginMonitor)e;
		return true;
	}

	public final void endObject(int idnum){
		int numAlive = 0;
		for(int i = 0; i < size; i++){
			AdminLoginMonitor monitor = elementData[i];
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
			AdminLoginMonitor[] oldData = elementData;
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
			AdminLoginMonitor monitor = (AdminLoginMonitor)elementData[i];
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

	public final void event_wrongMessageShow() {
		int numAlive = 0 ;
		for(int i = 0; i < this.size; i++){
			AdminLoginMonitor monitor = (AdminLoginMonitor)this.elementData[i];
			if(!monitor.MOP_terminated){
				elementData[numAlive] = monitor;
				numAlive++;

				monitor.Prop_1_event_wrongMessageShow();
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

class AdminLoginMonitor extends javamoprt.MOPMonitor implements Cloneable, javamoprt.MOPObject {
	public Object clone() {
		try {
			AdminLoginMonitor ret = (AdminLoginMonitor) super.clone();
			return ret;
		}
		catch (CloneNotSupportedException e) {
			throw new InternalError(e.toString());
		}
	}

	int Prop_1_state;
	static final int Prop_1_transition_wrongMessageShow[] = {2, 3, 1, 3};;

	boolean Prop_1_Category_fail = false;

	public AdminLoginMonitor () {
		Prop_1_state = 0;

	}

	public final void Prop_1_event_wrongMessageShow() {
		MOP_lastevent = 0;

		Prop_1_state = Prop_1_transition_wrongMessageShow[Prop_1_state];
		Prop_1_Category_fail = Prop_1_state == 3;
		{
			System.out.print("Admin Login Testing");
		}
	}

	public final void Prop_1_handler_fail (){
		{
			System.err.println("! It's really annoying to put wrong input thrice.");
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
			//wrongMessageShow
			return;
		}
		return;
	}

}

public aspect AdminLoginMonitorAspect implements javamoprt.MOPObject {
	javamoprt.map.MOPMapManager AdminLoginMapManager;
	public AdminLoginMonitorAspect(){
		AdminLoginMapManager = new javamoprt.map.MOPMapManager();
		AdminLoginMapManager.start();
	}

	// Declarations for the Lock
	static Object AdminLogin_MOPLock = new Object();

	static boolean AdminLogin_activated = false;

	// Declarations for Indexing Trees
	static AdminLoginMonitor AdminLogin_Monitor = new AdminLoginMonitor();

	// Trees for References

	pointcut MOP_CommonPointCut() : !within(javamoprt.MOPObject+) && !adviceexecution();
	pointcut AdminLogin_wrongMessageShow() : (call(public void AdminLogin.wrongMessageShow())) && MOP_CommonPointCut();
	after () : AdminLogin_wrongMessageShow() {
		AdminLogin_activated = true;
		synchronized(AdminLogin_MOPLock) {
			AdminLoginMonitor mainMonitor = null;

			mainMonitor = AdminLogin_Monitor;

			if (mainMonitor == null) {
				mainMonitor = new AdminLoginMonitor();

				AdminLogin_Monitor = mainMonitor;
			}

			mainMonitor.Prop_1_event_wrongMessageShow();
			if(mainMonitor.Prop_1_Category_fail) {
				mainMonitor.Prop_1_handler_fail();
			}
		}
	}

}
