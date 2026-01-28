package week4.day1;

public class MethodOverloading {
	
	public void reportStep(String message, String status) {
		System.out.println("Message :"+message);
		System.out.println("Status :"+status);
	}
	public void reportStep(String message, String status, boolean snap) {
		System.out.println("Message :"+message);
		System.out.println("Status :"+status);
		System.out.println("Snap :"+snap);
	}

	public static void main(String[] args) {
		MethodOverloading methodOverloading=new MethodOverloading();
		methodOverloading.reportStep("User Login Successfull", "Pass");
		methodOverloading.reportStep("User Login failed", "Failed", true);

	}

}
