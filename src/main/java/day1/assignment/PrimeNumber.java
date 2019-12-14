package day1.assignment;

public class PrimeNumber {
	
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13
	 * output: 13 is a Prime Number
	 * 
	 * Shortcuts:
	 * 1) Print : type: syso, followed by: ctrl + space + enter
	 * 2) To create a 'for' loop: type 'for', followed by ctrl + space + down arrow + enter
	 * 3) To create an 'if' condition: type 'if', followed by ctrl + space +down arrow + enter
	 *   
	 * What are my learnings from this code?
	 * 1)
	 * 2)
	 * 3) 
	 * 
	 */
	
	public static void main(String[] args) {

		int i,n=1000;
		
		boolean flag=false;
		
		
		for (i=2;n%i==0;i++)
		{
			flag=true;
			break;
			
		}
			if(flag==true)
			{
			System.out.println("Not a prime Numbe="+n);
			}
			else
			{
				System.out.println("Prime Number="+n);
			}
			
		
		
				
			
		
		
		// Declare an int Input and assign a value
		
		// Declare a boolean input as flag

		// Iterate from 1 to half of the input
		
			// Divide the input with each for loop variable and check the remainder
			
				// Set the flag as true when there is no remainder
				
				// break the iterator
				
		// Check the flag (Provide a condition)
		
			// Print 'Prime' when the condition matches
	}	
}
			// Print 'Not a Prime' when the condition doesn't match 
	 class prime
	{
		public static void main(String[] args)
		{
			int temp=0;
			for(int j=0;j<=10;j++) {
				temp+=j;
				System.out.println(temp);
				
			}
		}

	

}





