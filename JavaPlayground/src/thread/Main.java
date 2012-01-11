package thread;

/**
 * A runnable is not a thread
 * 
 * @author adrian.ronayne
 *
 */
public class Main {
	
	public static void main(String args[]){
		
		//Run in current call stack
		Runnable r = new RunnableThread();
		r.run();
		
		//Run in seperate thread
		Thread t = new Thread(r);
		t.start();
	}

}
