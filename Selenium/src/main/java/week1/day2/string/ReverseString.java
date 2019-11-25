package week1.day2.string;

public class ReverseString {
	public static void main(String[] args) {
		 String test = "feeling good";

		   char[] array1 = test.toCharArray();
		   for (int i = array1.length-1; i >=0; i--) {
			char ch = array1[i];
			   System.out.print(ch);
		   }
			
		}
		  
   

   
	// Build the logic to find the count of each
	/* Pseudo Code: 1
		a) Convert the String to character array
		b) Traverse through each character (using loop in reverse direction)
		c) Print the character (without newline -> like below
		   System.out.print(ch);
	*/

	
	
	
	/* Pseudo Code: 2
	a) Find the length of the string
	b) Traverse through each index from length-1 -> 0 (using loop in reverse direction)
	c) Find the character of the String using its index
	*/

}
