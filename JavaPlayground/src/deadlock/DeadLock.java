package deadlock;

public class DeadLock {
	
	/**
	 * The deadlock occurs when t1 is in d1.doSomethingWithOther() (ie: has a lock on d1) and t2 is in d2.doSomethingWithOther(). 
	 * When each thread tries to call doSomething() on the object the other thread has a lock on, they end up stuck, 
	 * waiting for eachother.

		Note that a deadlock doesn't necessarily involve only two threads. 
		It's possible to have a cycle of any size. 
		Worse, once a deadlock has been obtained, any other thread that also tries to depend on a deadlocked thread will end up 
		becoming deadlocked itself, even without being part of the cycle, per se. 
		
	 * This class copied copied from - from http://stackoverflow.com/questions/1997869/deadlock-situation-in-threads
	 *
	 */
	  static class Deadlocker {
	    private Deadlocker other;

	    public void setOther(Deadlocker other) {
	      this.other = other;
	    }

	    synchronized void doSomethingWithOther() {
	      try {
	        Thread.sleep(1);
	      } catch (InterruptedException e) {
	      }
	      other.doSomething();
	    }

	    synchronized void doSomething() {
	    }
	  }

	  public static void main(String[] args) {
	    final Deadlocker d1 = new Deadlocker();
	    final Deadlocker d2 = new Deadlocker();
	    d1.setOther(d2);
	    d2.setOther(d1);

	    Thread t1 = new Thread() {
	      public void run() {
	        d1.doSomethingWithOther();
	      }
	    };

	    Thread t2 = new Thread() {
	      public void run() {
	        d2.doSomethingWithOther();
	      }
	    };

	    t1.start();
	    t2.start();
	  }
	}

