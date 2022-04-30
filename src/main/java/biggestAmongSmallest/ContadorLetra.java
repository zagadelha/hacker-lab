package biggestAmongSmallest;

public class ContadorLetra {
	
	public static void main(String[] args) {
		
		String someString = "elephanteee";
		char someChar = "e".charAt(0);
		int count = 0;
		 
		for (int i = 0; i < someString.length(); i++) {
		    if (someString.charAt(i) == someChar) {
		        count++;
		    }
		}
		System.out.println(count);
	}

}
