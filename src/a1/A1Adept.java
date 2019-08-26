package a1;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class A1Adept {

	public static void main(String[] args) {
		ArrayList<String> nameIt = new ArrayList<String>();
		ArrayList<Double> priceIt = new ArrayList<Double>();
		ArrayList<String> nameF = new ArrayList<String>();
		ArrayList<String> nameL = new ArrayList<String>();
		double average = 0.0;
		Scanner scan = new Scanner(System.in);
		
		int numInStore = scan.nextInt();
		int i;
		String nameItem = null;
		double price = 0.0;
		double total = 0.0;
		String name = null;
		String lastName = null;
		int count;
		int quanity;
		String cusItName = null;
		int customers;
		ArrayList<Double> arrayTotals = new ArrayList<Double>();
		
		

			for( i = 0; i<numInStore; i++ ) {
				
				
				nameItem = scan.next();
				nameIt.add(nameItem);
			
				 price = scan.nextDouble();
                  priceIt.add(price);
			
			}
			
		customers = scan.nextInt();
			
				
				
				for (int k = 0; k<customers; k++) {
					
				
					name = scan.next();
					nameF.add(name);
					lastName = scan.next();
					nameL.add(lastName);
					count = scan.nextInt();
					
					for(int l = 0; l<count; l++) {
						quanity = scan.nextInt();
						cusItName = scan.next();
					int priceToString = nameIt.indexOf(cusItName);
						 total = total + (priceIt.get(priceToString) * quanity);
					
				}
					arrayTotals.add(total);
					total = 0;
					
				}
				double sum = 0.0;
				for (int o = 0; o<arrayTotals.size(); o++) {
					
					 sum = sum + arrayTotals.get(o);
				}
				average = sum/arrayTotals.size();
				 Object ma = Collections.max(arrayTotals);
				 Object mi = Collections.min(arrayTotals);
				 System.out.println("Biggest:" + " " + nameF.get(arrayTotals.indexOf(ma))+ " " + nameL.get(arrayTotals.indexOf(ma))+ " " + "(" + "" + String.format("%.2f", ma) + "" + ")" );        
				 System.out.println("Smallest:" + " " + nameF.get(arrayTotals.indexOf(mi))+ " " + nameL.get(arrayTotals.indexOf(mi))+ " " + "(" + "" + String.format("%.2f", mi) + "" + ")" ); 
				 System.out.println("Average:" + " " + String.format("%.2f", average));
				 
			
						
	}
}

