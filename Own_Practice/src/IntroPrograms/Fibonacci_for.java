package IntroPrograms;

public class Fibonacci_for {

	public static void main(String[] args) {
		
		
		int a = 0 ;
		int b = 1 ;
		int c ;
		int i ;
		int n  = 4 ;
		System.out.println(a);
		System.out.println(b);
		
		for (i = 1 ; i <= n ; i++) {
			c = a + b ;
			a = b ;
			b = c ;
			System.out.println(c);
			
		}
		
		
		
		

	}

}
