package week3.collections.classroom;

import java.util.HashMap;
import java.util.Map;

public class Mapp {

	public static void main(String[] args) {
		
		String Name=new String("Kalaivani");
		
		char[] Character = Name.toCharArray();
		
	   // System.out.println(charArray);
	    
	    Map<Character,Integer> map=new HashMap<Character, Integer>();
	    
	    for (char c : Character) 
	    
	    {
	    	
	    	if(map.containsKey(c))
	    	{
	    		map.put(c, map.get(c)+1);
	    	}
	    	else
	    		
	    	{
	    	map.put(c, 1);	
	    	}
			
		}
	    
	    System.out.println(map);
	    
	}

}
