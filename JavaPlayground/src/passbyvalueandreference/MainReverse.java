package passbyvalueandreference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainReverse {
	
	public static void main(String args[]){

		List<String> l = new ArrayList<String>();
		
		l.add("a");
		l.add("b");
		addToList(l , "d");
		
		for(String str : l){
			System.out.print(str);
		}
		
		System.out.println();
		

		
		reverseList(l);
		
		for(String str : l){
			System.out.print(str);
		}
	}

	private static void addToList(List<String> list , String value){
		list.add("d");
	}
	
	private static void reverseList(List<String> list){
		
		list.add("c");
		Collections.reverse(list);
		
	}
}
