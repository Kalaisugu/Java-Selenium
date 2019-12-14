package week3.Assignment3;

import java.util.LinkedHashSet;
import java.util.Set;

public class printdublicate {

	public static void main(String[] args) {
		
		Set<Character> printdub=new LinkedHashSet<>();
		
		String ip="Infosys Limited";
		
		char[] charArray = ip.toCharArray();
		
		for (char c : charArray) {
			
			if(printdub.contains(c))
			{
				printdub.add(c);
				System.out.println(c);
			}
			
			
			
			else
			{
				printdub.add(c);
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
