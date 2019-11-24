package day2.classroom.str;

public class ReverseStr {

	public static void main(String[] args) {
		
		// Here is the input
		String test = "feeling good";
		//System.out.println(test.length());
		char[] charArray = test.toCharArray();
		System.out.println(charArray);
		
		
		
		//for (int i = 11; i < charArray.length+1; i--) {
			
		
		for (int i=charArray.length-1;i >= 0;i--)
		{
			System.out.print(charArray[i]);
			
			
		}
	//	System.out.print(charArray);
		
		
		
		// Build the logic to find the count of each
		/* Pseudo Code: 1
			a) Convert the String to character array
			b) Traverse through each character (using loop in reverse direction)
			c) Print the character (without newline -> like below
			   System.out.print(ch);
		*/

		
		
		
		/* Pseudo Code: 2
		a) Find the length of the string
		b) Traverse through each index from length-1 -> 0 (using loop in reverse direction)
		c) Find the character of the String using its index
		*/
		
		
		
		
		
		
		
		
		
	}

}
