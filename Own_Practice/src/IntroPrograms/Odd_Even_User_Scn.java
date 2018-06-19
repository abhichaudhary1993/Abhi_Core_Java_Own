package IntroPrograms;

import java.util.Scanner;

public class Odd_Even_User_Scn {
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Numb = new Scanner(System.in);
		System.out.println(" Enter yor Desired Number Idiot ------->>>  ");
		int number = Numb.nextInt();
		
		if (number % 2 == 0) {
			System.out.println(" Your Entered number is !!!!!  EVEN  !!!!! ");
			
		}
		else {
		
			System.out.println(" Your Entered number is !!!!!  ODD  !!!!! ");

			
		}
		
		
		Numb.close();
		
		
		

	}

}
