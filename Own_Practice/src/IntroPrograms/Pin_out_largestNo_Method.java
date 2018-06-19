package IntroPrograms;

public class Pin_out_largestNo_Method {
	
	int a , b ,c ;
	
	
	public void largeNo() {
		if (a>=b && a>=c) {
			System.out.println("Largest number is " + a);
		}
		else if (b>=a && b>=c) {
			System.out.println("Largest number is " + b);
		}
		else {
			System.out.println("Largest number is " + c);
		}
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		Pin_out_largestNo_Method Big = new Pin_out_largestNo_Method();
		Big.a = -25;
		Big.b = -1;
		Big.c = 0 ;
		Big.largeNo();
		
		

	}

}
