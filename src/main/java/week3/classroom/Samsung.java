package week3.classroom;

public class Samsung extends Mobile{
	
	public String Record()
	{
		
		return "Only incoming";
}
	
	public String Record(String call)
	{
		if(call.equals("Kalai"))
		{
			return "only incoming";
		}
		
		else
		{
			return "incoming and outgoing";
		}
	}
	
	public static void main(String[] args) {
		Samsung ss = new Samsung();
		ss.Record();
		ss.Record("Kalai");
		ss.call();
		ss.Sms();
		
	}

}
