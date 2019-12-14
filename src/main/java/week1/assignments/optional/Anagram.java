package week1.assignments.optional;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		       //Declare a String 
				String text1 = "stop";
				//Declare another String
				String text2 = "pots";
				boolean flag=false;
				
				
				//build logic to check the given words are anagram or not
				
				/*
				 * Pseudo Code
				 * a) Check length of the strings are same then
				 * b) Convert both Strings in to characters
				 * c) Sort Both the arrays
				 * d) Check both the arrays has same value
				 * 
				 */
				
				//System.out.println(text1.length());
				//System.out.println(text2.length());
				char[] arr1=text1.toCharArray();
				char[] arr2=text2.toCharArray();
			//	System.out.println(arr1);
			//	System.out.println(arr2);
				Arrays.sort(arr1);
				Arrays.sort(arr2);
				//System.out.println(arr1);
				//System.out.println(arr2);
				if(Arrays.equals(arr1, arr2))
				{
	               flag=true;
	               System.out.println("Anagram");
				}
				else
				{
					flag=false;
					System.out.println("Not Anagram");
					
				}
				
				
		
				}

	}


