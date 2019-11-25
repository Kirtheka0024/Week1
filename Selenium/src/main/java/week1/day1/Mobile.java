package week1.day1;

public class Mobile {
	public long makecall() {
		System.out.println("someone has called");
		return 843890067L;
	}
    public String sendSms(String sms) {
    	System.out.println("SMS Sent");
		return "Hello";
    	
    }
    public boolean shut() {
		System.out.println("Mobile is Shutdown");
		return true;
    	}
public static void main(String[] args) {
	
	Mobile call = new Mobile();
	String sendSms = call.sendSms("Hello");
	System.out.println(sendSms);
    long makecall = call.makecall();
    System.out.println(makecall);
    boolean shut = call.shut();{
    System.out.println(shut);	
    }
}
}


