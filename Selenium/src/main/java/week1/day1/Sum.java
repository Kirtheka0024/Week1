package week1.day1;

public class Sum {
		public static void main(String[] args) {
			int number, remainder, Sum = 0;
			number =1345;
			while (number > 0) {
				remainder = number % 10;
				Sum = Sum + remainder;
				number = number / 10;
			}
		System.out.println("sum of digits is "+Sum);
		}
}

