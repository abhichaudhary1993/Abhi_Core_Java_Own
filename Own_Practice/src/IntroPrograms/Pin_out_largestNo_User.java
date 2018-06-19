package IntroPrograms;

import java.util.Scanner;

public class Pin_out_largestNo_User {
	
	
	public static void main(String[] args) {
		
		Scanner lrge = new Scanner(System.in);
		System.out.println("Enter your number 1 -----> ");
		int num1 = lrge.nextInt();
		System.out.println("Enter your number 2 -----> ");
		int num2 = lrge.nextInt();
		System.out.println("Enter your number 3 ----->");
		int num3 = lrge.nextInt();
		lrge.close();
		
		if (num1>=num2 && num1>=num3) {
			System.out.println("Largest number is " + num1);
		}
		else if (num2>=num1 && num2>=num3) {
			System.out.println("Largest number is " + num2);
		}
		else {
			System.out.println("Largest number is " + num3);
		}
		
		
		
		
		
		
		
		

	}

}
