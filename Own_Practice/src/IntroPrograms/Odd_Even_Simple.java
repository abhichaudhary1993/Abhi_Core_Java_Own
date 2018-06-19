package IntroPrograms;

public class Odd_Even_Simple {
	int a  ;
	
	public void check() {
		System.out.println("Your First  number is  -------->>>>>  " + a);
		
		
		if (a % 2 == 0) {
			System.out.println("Your Given number is ******* EVEN *******  ");
			
		}
		
		else {
			System.out.println("Your Number is not EVEN But this is ********* ODD **********  ");
			
		}
		
	}
	
	
	
	

	public static void main(String[] args) {
		Odd_Even_Simple numb = new Odd_Even_Simple();
		numb.a = 86;
		numb.check();
		
		
		
		
		

	}

}
