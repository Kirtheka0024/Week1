package week1.monday.assignment;

public class ReverseEvenWords {
	public static void main(String[] args) {
		// Here is the input
		String test="I am a software tester";
		
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
		
		
		
		String[] text = test.split(" ");
		for (int i = 0; i < text.length; i++) {
			if (i % 2 != 0) {
				char[] array = text[i].toCharArray();
				for (int j = array.length-1; j >=0; j--) {
					char ch = array[j];
					   System.out.print(ch);
				   }
					}
			else {
			System.out.print(" " + text[i] + " ");
			}
			}
			
		}
		/* Pseudo Code:
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		d) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		e) print the even position words in reverse order using another loop (nested loop)
		 
	*/
		
		

	}



