package week3.Assignment2;

public class Bajaj extends Bike{
	 
		public String speed()
	{
	   return "2500 RPM";
	}
		
		public static void main(String[] args) {
			
		
	        Bajaj bb=new Bajaj();
	        
	       System.out.println(bb.speed()); 
	       
	       System.out.println(bb.cost());
	
	}
}


