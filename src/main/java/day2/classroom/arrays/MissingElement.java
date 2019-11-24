package day2.classroom.arrays;

import java.util.Arrays;

public class MissingElement {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,4,6,7,8};
	//2,3,4,6,7,8
		Arrays.sort(data);
		/*Arrays.b
	
		for (int i = 1; i < data.length; i++) {
			int ev = data[i]+1;
			if(data[i+1]!= ev) {
				System.out.println(data[i]);
			}
			
			
		}*/
		
	
		
for(int i=0;i<=data.length-1;i++)
	
{
	//System.out.println(data[i]);
	int j=data[i+1];
	
	if(data[i]!=j)
		{
		System.out.println(data[i]+"missing:"+j);
		}
	else
	{System.out.println("");
	
	}
}


	
	
	
	
	/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Traverse through each array item
		 3) Compare consecutive items -> 
		 		the next one should be = previous one + 1
		 4) If the following one is not +1 -> Print as missing
		 */
		
		
		
		
		
		
		
		// Print the second largest number	
		
		
	}

}
