package week1.assignments;

public class RemoveDuplicatesWords {
	
	public static void main(String[] args) {
		// Use the declared String text as input
		String text = "We learnt java basics as part of java sessions in week1 java sessions";
		// Initialise an integer variable as count
		int count = 0;
			/*
			 * Pseudo code 
			 * a) Split the String into array and iterate over it 
			 * b) Initialise another loop to check whether the word is there in the array 
			 * c) if it is available then increase and count by 1. 
			 * d) if the count > 1 then replace the word as "" 
			 * e) print the each word
			 */
		
		
		
		//System.out.println(charArray);
		
		String[] str=text.split(" ");
		
			for (int i = 0; i < str.length; i++) {
				
				count=1;
				
				for (int j =i+1; j < str.length; j++) {
					
					if(str[i].equals(str[j]))
						
					{
						count++;
						str[j]="0";
						
						}
				}
					if(count>1 && str[i]!="0")
						
					{
						
						System.out.println(str[i]);
					}
				}
			}
	}

						