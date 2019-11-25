package week1.assigment1;

public class Amstrong {
	public static void main(String[] args) {
		int c = 0,a,temp;
		int n = 371;
		temp = n;
		while (n > 0) {
			a = n%10;
			n = n/10;
			c = c+(a*a*a);
		}
		if (temp==c) {
			System.out.println("Amstrong Number");
			
		} else {

			System.out.println("Not an amstrong number");
		}
	}

}
