package week3.day5.classroom;

public class Redmi extends Mobile {
	public String ModelNo() {
		return "A30";
	}
public String ModelNo( String ModelNum, String Color ) {
	if(ModelNum.equals("A30") && Color == "Black")  {
		return "RedmiNew";
		
	}
	else {
	return "RedmiOld";
}
	
	}
public int cost(){
	return 15000;
}
public static void main(String[] args) {
	Redmi dd = new Redmi();
	dd.display();
	dd.cost();
	dd.ModelNo();
	dd.ModelNo("apple", "SpACE GREY ");
}
}

