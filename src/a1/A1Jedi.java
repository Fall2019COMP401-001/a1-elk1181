package a1;

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class A1Jedi {

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
		ArrayList<ArrayList<String>> nme = new ArrayList<ArrayList<String>>(customers);
		
		
				for (int k = 0; k<customers; k++) {
					
				
					name = scan.next();
					nameF.add(name);
					lastName = scan.next();
					nameL.add(lastName);
					count = scan.nextInt();
					ArrayList<String> nameFood = new ArrayList<>();
					
					
					for(int l = 0; l<count; l++) {
						
						quanity = scan.nextInt();
						
						cusItName = scan.next();
						nameFood.add(cusItName);
					int priceToString = nameIt.indexOf(cusItName);
						 total = total + (priceIt.get(priceToString) * quanity);
						 for(int y =0; y<quanity-1; y++)
						 {
						nameFood.add(cusItName);
						 }
						 
						 
						
				}
					
					nme.add(nameFood);
					
					
					
					
					arrayTotals.add(total);
					total = 0;
					
					
				
					
					
				}
				
				
			int h = 0;
					int index = 0;
					int sum = 0;
					for(h=0; h<nameIt.size();h++) {
				   for(int g = 0; g<nme.size(); g++) {
					   
						if(nme.get(g).contains(nameIt.get(h))) {
							index = index+1;
	
								for(int d = 0; d<nme.get(g).size(); d++) {
									if (nme.get(g).get(d).contains(nameIt.get(h))){
										sum = sum+1;
									}
								
								
							}
						}
							
							
						}
				   if (index ==0) {
						System.out.println("No" + " " + "customers" + " " + "bought" + " " + nameIt.get(h));
						
						
					}
					if (index != 0) {
						System.out.println(index + " " + "customers" + " " + "bought" + " " + sum + " " + nameIt.get(h));
						index = 0;
						sum = 0; 
					}
					  
						
					}
				   
				   
				  
					}

					
					

		  	
					   	
				
				
				
				}
