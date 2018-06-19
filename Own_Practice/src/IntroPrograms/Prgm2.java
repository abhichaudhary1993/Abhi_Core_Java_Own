package IntroPrograms;

import java.util.Scanner;


// Arithmetic operations of two numbers with taking data to the users
public class Prgm2 {
	
	
	

	public static void main(String[] args) {
		
		
		
		Scanner first_num = new Scanner(System.in);
		
		System.out.println("Enter your first number : -->  " );
		
		int num1 = first_num.nextInt();
		      
		
		System.out.println("Enter your Second number : -->  " );
		
		int num2 = first_num.nextInt();
		
		first_num.close();
		
		int c = num2 + num1 ;
		int d = num2 * num1 ;
		int e = num2 - num1 ;
		int f = num2 / num1 ;
		int g = num2 % num1 ;
		System.out.println("Your addition is -->  " + c);
		System.out.println("Your Multiplication is -->  " + d);
		System.out.println("Your Substraction is -->  " + e);
		System.out.println("Your Divison is -->  " + f);
		System.out.println("Your reminder is -->  " + g);
		
		
		
		
		
	
	

	}

}
