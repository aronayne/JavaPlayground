package systemexit;

/**
 * Finally clause does not always run!!!
 * @author adrian.ronayne
 *
 */
public class Main {

	public static void main(String args[]){
		
		try {
			System.exit(1);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			System.out.println("In finally clause");
		}
	}

}
