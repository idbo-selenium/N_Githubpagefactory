package testNGIgnoreTest;

public class TestSuite {

	public String message;
	public TestSuite(String message){
		this.message = message;
	}
	
	public String PrintMessage(){
		System.out.println("PrintMessage method is : "+message);
		return message;
	}
	
	public String SalutationMessage(){
		message = "Hi " + message;
		System.out.println("SalutationMessage method is : "+message);
		return message;
	}
	
	public String ExitMethod(){
		message = "www."+message;
		System.out.println(message);
		return message;
	}
}