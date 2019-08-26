package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		
	int customers = scan.nextInt();
	int i;
	String fname = null;
	String lname = null;
	double total = 0.0;
	String array[]= new String [customers];
	

		for( i = 0; i<customers; i++ ) {
			
			
			fname = scan.next();
		
			 lname = scan.next();

			
			int numItems = scan.nextInt();
			
			
		
			for (int k = 0; k<numItems; k++) {
				
			
				int quanity = scan.nextInt();
		
			    String item = scan.next();
			
			    double pri = scan.nextDouble();
			   total = total + (pri * quanity);
			   array[i] = fname.charAt(0)+ "."+ ' ' + lname + ':'+ ' ' + Double.toString(total);
			
			
			}
		total = 0;
		
	if (i==(customers-1)) {
	for(int g = 0; g<customers; g++) {
		System.out.println(array[g]);
	}
	
	}
	
	
		}
		
	}
}
