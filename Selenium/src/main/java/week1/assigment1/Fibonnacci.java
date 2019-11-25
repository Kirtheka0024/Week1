package week1.assigment1;

public class Fibonnacci {
	public static void main(String[] args) {
	int n = 10, a = 0, b = 1;
	int sum = 0;
	System.out.println("Fist " + n +" terms : ");
	for (int i = 1; i <= 10; i++) {
		System.out.print(a + "+");
		sum = a + b ;
		a = b;
		b = sum;
	}
	
	}

}
