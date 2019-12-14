package week3.classroom;

public class Redmi extends Mobile {
	
	public void camera()
	{
		System.out.println("8mb front 10mb back");
	}
	
	public void videoCall() {
		System.out.println("Made Video Call");
	}
	
	public static void main(String[] args) {
		
		
		Redmi dd = new Redmi();
		dd.camera();
		dd.call();
		dd.Sms();
		
		
	}
	
	
	
	
}
