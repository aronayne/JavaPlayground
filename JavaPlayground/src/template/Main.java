package template;

/**
 * Example of the template pattern, similar to how paint() works method in java
 * @author adrian.ronayne
 *
 */
public class Main {

	public static void main(String args[]){

		System.out.println("BasicField initialisation");
		Field f2 = new BasicField();
		f2.paint();
		
		System.out.println("\nVeryBasicField initialisation");
		Field f3 = new VeryBasicField();
		f3.paint();

	}
}
