package wordswitch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
	
	/**
	 * Switch every pair of words in a string ("ab cd ef gh" becomes "cd ab gh ef")
	 * @param args
	 */
	public static void main(String args[]){
		
		String str = "ab cd ef gh";
		
		String[] splitString = str.split(" ");
		
		List<String> splitStringList = Arrays.asList(splitString);
		String newStr = "";
		
		for(Iterator<String> it = splitStringList.iterator(); it.hasNext();){
			String tempStr1 = it.next();
			String tempStr2 = it.next();
			newStr += tempStr2 + " " +tempStr1;
			newStr += " ";
		}
		

		System.out.println(newStr);
	}

}
