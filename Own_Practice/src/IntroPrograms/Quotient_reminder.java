package IntroPrograms;

public class Quotient_reminder {
	
	double a ;
	double b ;
	
	
	public void compute() {
		
		System.out.println("Your first number is " + a  );
        System.out.println("Your second number is " + b);
        System.out.println("Quotient is  " + (a/b));
        System.out.println("Reminder is " + (a%b));

		
        
	}

	public static void main(String[] args) {
		
		Quotient_reminder Num = new Quotient_reminder();
		Num.a = 50 ;
		Num.b = 25;
		Num.compute();
		
		
		

	}

}
