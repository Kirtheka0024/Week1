package week1.monday.assignment;

public class ChangeOddIndex {
	public static void main(String[] args) {
		String test = "changeme";
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			if(i % 2 == 0) {
		System.out.print(Character.toUpperCase(c));
			 }
			else {
				System.out.print(c);
			}
		}
		
	}
}
	
	
	/* Pseudo Code: 
	
	a) Convert the String to character array
	b) Traverse through each character (using loop)
	c) find the odd index within the loop (use mod operator)
	d) within the loop, change the character to uppercase if the index is odd else don't change
	   (use Character.toUpperCase(ch) and print without new line as System.out.print(ch);
	   	public static void main(String[] args) {

String test = "changeme";
char[] array1 = test.toCharArray();
for (int i = 0; i < array1.length; i++) {
char c = array1[i];
if(i % 2 != 0) {
  c = array1.toUpperCase(c);
}



}

*/

