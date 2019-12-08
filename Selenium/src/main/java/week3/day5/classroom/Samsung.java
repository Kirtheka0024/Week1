package week3.day5.classroom;

public class Samsung extends Mobile {


		public String ModelNo1() {
			return "Samsumg1";
		}
	public String ModelNo1( String ModelNum, String Color ) {
		if(ModelNum.equals("Samsung1") && Color == "Grey")  {
			return "samsungnew";
			
		}
		else {
		return "Samsung1";
	}
	}
	public static void main(String[] args) {
		Samsung ss = new Samsung();
		ss.display();
		ss.cost();
		ss.ModelNo1();
		ss.ModelNo1("samsung", "grey");
	}
	
}



	


