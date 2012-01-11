package reversestatement;

public class Main {
	
	public static void main(String args[]){
		
		String reverseStatement = "reverse this statement";
		String reversed = "";
		
		for(int count = reverseStatement.length() - 1; count >= 0; --count){
			reversed += String.valueOf(reverseStatement.charAt(count));
		}
		
		System.out.println("Reversed is - "+reversed);
	}

}
