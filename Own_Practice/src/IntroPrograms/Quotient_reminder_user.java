package IntroPrograms;

import java.util.Scanner;

public class Quotient_reminder_user {
	
	
	

	public static void main(String[] args) {
		
		Scanner Num = new Scanner(System.in);
		System.out.println("\\\\\\\\\\  Enter your First number //////////////  " + "--> ");
		int a = Num.nextInt();
		System.out.println("  ***************** Your First Number is ****************   " + a );
		System.out.println("\\\\\\\\\\\\  Enter your Second  number /////////////////   " + "--> ");
		int b = Num.nextInt();
		System.out.println("   ************ Your Second Number is ***************  " + b );
		Num.close();
		
		double c = a / b ;
		double d = a % b ; 
		
		System.out.println( "------------->>>>>>>    Quotient of your numbers is    <<<<<<<  ---------------------   " + c );
		System.out.println( "!!!!!!!!!!!!!!!!!!!!!!     REMINDER OF YOUR NUMBERS IS !!!!!!!!!!!!!!!!!!!!!  " + d);
		
		
		
		

	}

}
