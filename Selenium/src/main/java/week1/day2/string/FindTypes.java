package week1.day2.string;

public class FindTypes {
	public static void main(String[] args) {
		
			String test = "$$ Welcome to 2nd Automation Class $$ ";

			int  letter = 0, space = 0, num = 0, specialChar = 0;

			char[] array1 = test.toCharArray();
			for (int i = 0; i < array1.length; i++) {
				if (Character.isLetter(array1[i])) {
					letter++;
					}
				else if (Character.isDigit(array1[i])) {
					num++;
				}
				else if (Character.isSpaceChar(array1[i])) {
					space++;
				}
				else {
					specialChar++;
				}
			}
			System.out.println("letter: " + letter);
			System.out.println("number: " + num);
			System.out.println("space: " + space);
			System.out.println("specialCharcter: " + specialChar);
			
			
			// Build the logic to find the count of each
			/* Pseudo Code:
				a) Convert the String to character array
				b) Traverse through each character (using loop)
				c) Find if the given character is what type using (if)
						i)  Character.isLetter
						ii) Character.isDigit
						iii)Character.isSpaceChar
						iv) else -> consider as special character
			*/

			// Print the count here
		
		}

	}

