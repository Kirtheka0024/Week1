package week1.day2.string;

public class CharacterOccurence {
	
	public static void main(String[] args) {

		String test = "I am getting better with Java";
    	char ch = 't';
    	int totalCount = 0;
    	char[] array1 = test.toCharArray();
    	for (int i = 0; i < array1.length; i++) {
    		
			if (array1[i]==ch) {
				totalCount++;
			}
		}
    	
		System.out.println("Total count of character("+ch+"): " + totalCount);

		// Build the logic to find the count of each
		/* Pseudo Code:
			a) Convert the String to character array
			b) Traverse through each character (using loop)
			c) If the given character matches the expected character (ch),
			   Then, increment totalCount
		*/

		
		
		
		
		
		
		
		
		
		// Print the count here

		
	}

}

