package week3.Assignment1;

public class Desktop implements Hardware, Software {
	

		
		public void hardwareresources()
		{
			System.out.println("Hardware Resources - Keyboard Mouse");
		}
		
		public void softwareresources()
		{
			System.out.println("Software Resources  - operating System");
		}
		
		public int Desktopmodel()
		{
			return 85854;
		}
		
		public static void main(String[] args) {
			
			Desktop obj=new Desktop();
			
			obj.hardwareresources();
			obj.softwareresources();
			System.out.println("Model Number "+obj.Desktopmodel());
			
			
		}
		
	}


