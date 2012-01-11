package mostoccurencesofnumber;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	
	public static void main(String args[]){
		
		int[] numbers = {1,5,4,7,3,2,5,3,1,5,3,7,5,7,7,7,7,7,7};        
		int[] counterArray = new int[numbers.length];

		for (int i = 0; i < numbers.length; ++i){
		    counterArray[numbers[i]] = counterArray[numbers[i]] + 1;
		}

		int maxNumber = 0;
		for (int i = 0; i < numbers.length; ++i){
		    if(counterArray[i] > counterArray[maxNumber])
		    {
		        maxNumber = i;
		    }
		}
		         
		System.out.println(maxNumber);
		
		Map<Integer, Integer> occurences = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < numbers.length; ++i){
			Integer currValue = occurences.get(Integer.valueOf(numbers[i]));
			if(currValue == null){
				occurences.put(Integer.valueOf(numbers[i]), 1);
			}
			else {
				occurences.remove(Integer.valueOf(numbers[i]));
				occurences.put(Integer.valueOf(numbers[i]), currValue+1);
			}
		}

		int max = Collections.max(occurences.values());
	//	int maxKey = occurences.get
		System.out.println("Max is - "+max);
	}

	private static void incrementValue(Map<String, Integer> counters, String toAdd) {
	    Integer currValue = counters.get(toAdd);
	    if (currValue == null)
	        counters.put(toAdd, 1);
	    else
	        counters.put(toAdd, currValue+1);
	}
	

}
