package passbyvalueandreference;

/**
 * Java passes method parameters by value, not reference

Java is always pass-by-value. 
The difficult thing can be to understand that Java passes objects as references passed by value.
 */
import java.util.ArrayList;
import java.util.List;

public class Main {

	
	public static void main(String args[]){
		Main m = new Main();
		m.getList();
		
		m.updatePrimitive();
	}
	
	private void getList(){
		List l = new ArrayList();
		l.add("test");
		System.out.println("Size is - "+l.size());
		passByValue(l);
		System.out.println("Size is - "+l.size());
	}
	
	private void passByValue(List list){
		/**
		 * list ref now points to a new ArrayList object but since list is a copy adding "2" to
		 * the list updates original list but creating a new ArrayList with the list(copy)
		 * has no impact on List passed in caller method, this is because object ref list is a copy
		 */
		list.add("2");
		list = new ArrayList();
		System.out.println("In Main.passbyvalue(). Size is - "+list.size());
	}

	private void updatePrimitive(){
		int num = 0;
		System.out.println("Num is "+num);
		this.incrementPrimitive(num);
		System.out.println("Num now is "+num);
	}
	
	private void incrementPrimitive(int num){
		++num;
	}
}
