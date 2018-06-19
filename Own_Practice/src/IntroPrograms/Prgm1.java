package IntroPrograms;

import java.util.Scanner;

//import Scanner class which is in util folder inside the java folder.
//In java -
//util :stands for utility and contains utility classes. 
//Scanner : is a predefined class for taking inputs from user.

//Program to print an integer by taking input to the user
public class Prgm1 {
	
	
	

	public static void main(String[] args) {
		
				// This is to be used for read the input from keyboard and we create an object intgr for this
				
	
		
		Scanner intgr = new Scanner(System.in);
	    
		
		// This statement print that line between the quotes
		
		System.out.println("Enter your choice number:-  " );
		
		// we create an variable which is int type and nextInt() reads the value which we enter by keyboard and stores in 
		// variable
		 
		int myNumber = intgr.nextInt();
		
		intgr.close();
		
		// This statement print that line between the quotes + print store value in variable
		
		System.out.println(" Your Desired number is :- "  + myNumber);
		
		 

	}

}


