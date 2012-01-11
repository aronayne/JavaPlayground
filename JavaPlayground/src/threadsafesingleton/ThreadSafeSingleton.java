package threadsafesingleton;

/**
 * 
 * Since the line private static final ThreadSafeSingleton INSTANCE = new ThreadSafeSingleton(); 
 * is only executed when the class FooLoader is actually used, 
 * this takes care of the lazy instantiation, and is it guaranteed to be thread safe.
 *
 * Taken from http://stackoverflow.com/questions/70689/efficient-way-to-implement-singleton-pattern-in-java
 */
public class ThreadSafeSingleton {
	
	  private static class ThreadSafeSingletonLoader {
	        private static final ThreadSafeSingleton INSTANCE = new ThreadSafeSingleton();
	   }

	   private ThreadSafeSingleton() {
	        if (ThreadSafeSingletonLoader.INSTANCE != null) {
	            throw new IllegalStateException("Already instantiated");
	        }
	    }

	   
	public ThreadSafeSingleton getSingletonObject(){
		return ThreadSafeSingletonLoader.INSTANCE;
		
	}
}
