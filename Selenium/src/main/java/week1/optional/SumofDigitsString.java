package week1.optional;

public class SumofDigitsString {

	public static void main(String[] args) {
		
				String text = "Tes12Le79af65";
				int sum = 0;
				
	//String str = text.replaceAll(text,"");
				//char[] array = str.toCharArray();
				//for (int i = 0; i < array.length; i++) {
					//int num = Character.getNumericValue(i);
					//sum = sum + num;
					//System.out.println(sum);
					//}
				for (int i = 0; i < text.length(); i++) {
					char temp = text.charAt(i);
					if(Character.isDigit(temp)) 
					{
						Character.getNumericValue(temp);
					}
					
				}

	}

}

				
				
				//build a logic to get sum of all the digits from the given string
				
				/*
				 * Method 1
				 * Pseudo Code
				 * 
				 * a) using replaceAll(), replace all the non-digits into ""
				 * b) Now, convert the String into array
				 * c) Iterate over the array and get each character
				 * d) Using Character.getNumericValue(), Change the char into int
				 * e) Add the values to sum & print
				 * 
				 */
				
				/*
				 * Method 2
				 * Pseudo Code
				 * 
				 * a) Iterate an  array over the String
				 * b) Get each character and check if it is a number using Character.isDigit()
				 * c) Now covert char to int using Character.isDigit() and add it to sum
				 * d) Now Print the value
				 */

