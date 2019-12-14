package week3.Assignment3;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import java.util.Set;



public class Removedublicate {


	public static void main(String[] args) {

		String input="PayPalIndia";

		char[] array = input.toCharArray();

		Set<Character> dublicate=new LinkedHashSet<>();

		for (char character : array) {

			if(dublicate.contains(character))
			{
				dublicate.add(character);

				System.out.println(character);

			}

			else
			{
				dublicate.add(character);
			}


		}

		System.out.println(dublicate); 



	}	




} 	






