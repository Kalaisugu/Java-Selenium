package week1.assignments;

public class ReverseEvenWords {
	
	public static void main(String[] args) {
		// Here is the input
		String test="I am a software tester in my organization";
		
		//Build a logic to reverse the even position words (output: I ma a erawtfos tester)
		
		/* Pseudo Code:
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		d) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		e) print the even position words in reverse order using another loop (nested loop)
		 
	*/ 
		String[] str=test.split(" ");
		
	for (int i = 0; i < str.length; i++) {
				
		//	System.out.println(str[i]);
			
			if(test.indexOf(str[i%2])!=0) {
				
           // System.out.println(str[i].concat(" "));
			}
			else
			{
				char[] charArray=str[i+1].toCharArray();
				//System.out.println(charArray);
				
			
			
	
	      for (int j = charArray.length-1;j>=0; j--) {
	    	  
	    	  System.out.println(charArray[j]);
	    	 // System.out.println(str[i].concat(charArray[j]));
	      }	
	      
	   }
			
		}
	}
}

		
		
		
			
		
		

	

	


