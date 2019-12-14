package week1.assignments.optional;

public class palindrome {

	public static void main(String[] args) {
		//Declare a String text with a value
				String text = "madam";
				//Declare another String rev
				String rev="";
				
				//Build a logic to find the given string is palindrome or not
				/*
				 * Pseudo Code
				 * a) Iterate over the String in reverse order
				 * b) Add the char into rev
				 * c) Compare text and rev, if it is same then print palindrome 
				 */
				char[] str=text.toCharArray();
				
				for (int i = str.length-1;i>=0; i--)
				{
					//System.out.println(Array[i]);
					
				rev=new String(str);
				}
				
				System.out.println(rev);
				
				
				if(text.equals(rev))
					
				{
					System.out.println("Palindrome");
				}
					
					
				}


}
