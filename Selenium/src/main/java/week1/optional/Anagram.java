package week1.optional;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
	       //Declare a String 
			String text1 = "stop";
			//Declare another String
			String text2 = "pots";
			if (text1.length()  == text2.length()) {
		        char[] arr1 = text1.toLowerCase().toCharArray();
				char[] arr2 = text2.toLowerCase().toCharArray();
				Arrays.sort(arr1);
				Arrays.sort(arr2);
				if (arr1.equals(arr2)) {
					System.out.println(text1 + " and " + text2 + " are anagrams");
					
				} else {
					System.out.println(text1 + " and " + text2 + " are not anagrams");
				}
				
			}
			
			
			//build logic to check the given words are anagram or not
			
			/*
			 * Pseudo Code
			 * a) Check length of the strings are same then
			 * b) Convert both Strings in to characters
			 * c) Sort Both the arrays
			 * d) Check both the arrays has same value
			 * 
			 */

}


}
