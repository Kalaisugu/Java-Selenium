package day2.classroom.arrays;

import java.util.Arrays;

public class PrintDuplicates {

	
	public static void main(String[] args) {

		// Here is the input
		int[] data= {1,3,8,3,11,5,6,4,7,6,7};
		Arrays.sort(data);
		for (int i = 0; i < data.length-1; i++) {
			//System.out.println(data[i]);
			int j=data[i+1];
			System.out.println(j);
			if(data[i]==j)
			{
			
			System.out.println("duplicate "+data[i]);
			
		}
		}
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Loop through each array item
		 3) If the consecutive array items are same -> then print as duplicates
		 */
		
		
		
		
		
		
		
		// Print the second largest number	
		
		
	}
}

