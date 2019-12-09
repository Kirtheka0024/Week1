package week3.assignment;

public class Desktop implements HardWare, SoftWare {

	public String hardwareResources() {
		
		System.out.println("Hardware");


		return "hardwareResources";
	}

	public String softwareResources() {
		
		System.out.println("Software");
       
		return "SoftwareResources";

	}

	public void DesktopModel() {

		System.out.println("Class Method: Desktop Model");

	}

	public static void main(String[] args) {
		Desktop a = new Desktop();
		a.hardwareResources();
		a.softwareResources();
		a.DesktopModel();

	}

}
