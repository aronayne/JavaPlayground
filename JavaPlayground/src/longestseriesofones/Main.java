package longestseriesofones;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String args[]){
		String digit = "0111111000111000010101010101111110000001";
		int mostOnes = 0;
		int previousMostOnes = 0;
		
		for(int pos = 0; pos < digit.length(); ++pos){
			if(digit.charAt(pos) == '1'){
				++mostOnes;
			}
			else {
				if(mostOnes > previousMostOnes){
					previousMostOnes = mostOnes;
				}
				mostOnes = 0;
			}
		}
		if(mostOnes > previousMostOnes){
			previousMostOnes = mostOnes;
		}
		
		for(int counter = 0; counter < previousMostOnes; ++ counter){
			System.out.print("1");
		}

	}

}
