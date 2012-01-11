package staticoverride;

public class ChildClass extends ParentClass{

	/**
	 * 	Not compiling because method() in parent class is final
	 * No polymorphism here anyway regardless
	 */
	public static void method(){
		
	}
	
}
