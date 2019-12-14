package week3.Assignment3;

import java.util.LinkedHashSet;
import java.util.Set;

public class Distinctcharacter {

	public static void main(String[] args) {
		
		Set<Character> distinct=new LinkedHashSet<>();
		
		String ip="Amazon India Private Limited";
		
		String replace = ip.replaceAll("\\s+", "");
		
		char[] charArray = replace.toCharArray();
		
		for (char each : charArray) {
			
			if(distinct.contains(each)) {
			
			distinct.add(each);
			
		}
		else
		{
			distinct.add(each);
		}
		

	}
		
		System.out.println(distinct);

}
	
}
