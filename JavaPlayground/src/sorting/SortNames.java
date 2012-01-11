package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortNames {
	
	public static void main (String args[]){
		
		List<String> names = new ArrayList<String>();
		names.add("ztestdd");
		names.add("atestddd");
		names.add("ctestd");
		names.add("dtest");
		
		Comparator<String> alphabeticComparator = new Comparator<String>(){
			@Override
			public int compare(String arg0, String arg1) {
				return arg0.compareTo(arg1);
			}
		};
		
		Comparator<String> lengthComparator = new Comparator<String>(){
			@Override
			public int compare(String str1, String str2) {
				
				if(str1.length() < str2.length()){
					return -1;
				}
				else if(str1.length() > str2.length()){
					return 1;
				}
				else {
					return 0;
				}
			}
		};
		
		Collections.sort(names , alphabeticComparator);
		for(String name : names){
			System.out.println(name);
		}
		
		Collections.sort(names , lengthComparator);
			for(String name : names){
				System.out.println(name);
			}
			
		}
	
	}

