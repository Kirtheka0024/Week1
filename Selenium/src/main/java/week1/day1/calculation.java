package week1.day1;

public class calculation {
	public static void main(String[] args) {
		int a=9,b=4,sum,diff,mul,div;
		switch ('+') {
		case '-':
			diff=a-b;
			System.out.println("The difference is "+diff);
			break;
		case '*':
			mul=a*b;
			System.out.println("The Product is "+mul);
			break;
		case '+':
			sum=a+b;
			System.out.println("The sum is "+sum);
		case '%':
			div=a%b;
			System.out.println("The Remainder is "+div);
			default :
				System.out.println("not valid");
				break;
			
		}
	}

}
