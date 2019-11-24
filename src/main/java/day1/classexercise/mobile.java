package day1.classexercise;

public class mobile {
	
	public void makeacall(long num) {
		System.out.println("makeacallto the number:"+num);
	}
			public void sendsms(String msg) {
				System.out.println("SMS:"+msg);
			}
					public boolean shutdown() {
						
						return true;
					}
					public long call() {
						System.out.println("call to the number:");
						return 95006377;
					}
					
					
							
						
							public static void main(String[] args) {
								mobile m=new mobile();
								m.makeacall(95006377);
								m.sendsms("Kalai");
								boolean shutdown = m.shutdown();
								System.out.println(shutdown);
								long call = m.call();
								System.out.println(call);
							}
								
							}
		
	
						
		
		
		
		
	


