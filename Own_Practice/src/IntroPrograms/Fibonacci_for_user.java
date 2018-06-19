package IntroPrograms;

import java.util.Scanner;

public class Fibonacci_for_user {
	
	/*
	 * Start
Declare variables i, a,b , show
Initialize the variables, a=0, b=1, and show =0
Enter the number of terms of Fibonacci series to be printed
Print First two terms of series
Use loop for the following steps
-> show=a+b
-> a=b
-> b=show
-> increase value of i each time by 1
-> print the value of show
End
	 */

	public static void main(String[] args) {
		int a = 0 , b = 1 , show = 0 ;
		int i ;
		
	   
	    
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of terms of Fibonacci series to be printed");
	    

	    int num = sc.nextInt();
	    sc.close();
	    System.out.println(a);
	    System.out.println(b);
	   
	    for (i = 0 ; i <= num ; i++) {
		   show = a + b ;
			a = b ;
			b = show ;
			System.out.println(show);
	    }
	    
	    
		
		
		
		

	}

}
