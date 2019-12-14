package week3.Assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortinReverseOrder {

	public static void main(String[] args) {
		
		List<String> companies=new ArrayList<String>();
		
		System.out.println(companies.isEmpty());
		
		companies.add("HCL");
		
		companies.add("Aspire systems");
		
		companies.add("CTS");
		
		System.out.println(companies.size());
		
		for (String eachcompany : companies) {
			
			System.out.println(eachcompany);
			
		}
		
	//To sort String
		
		Collections.sort(companies);
		
		System.out.println(companies);
		
	//To reverse sort
		
		Collections.reverse(companies);
		
		System.out.println(companies);
		
		
		
		
		
		

	}

}
