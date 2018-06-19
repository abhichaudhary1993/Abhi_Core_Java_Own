package IntroPrograms;

public class star {
	
	public static void drawRow(int n, int i) {
	    //initial spaces
	    for (int spaces = 1; spaces <= i; spaces++)
	        System.out.print(" ");

	    //star
	    System.out.print("*");

	    //post spaces
	    for (int spaces = 1; spaces <= n - i - 1; spaces++)
	        System.out.print(" ");

	    //star
	    System.out.print("*");

	    //initial spaces
	    for (int spaces = 1; spaces <= n - i - 1; spaces++)
	        System.out.print(" ");

	    //star
	    System.out.print("*");

	    //post spaces
	    for (int spaces = 1; spaces <= i; spaces++)
	        System.out.print(" ");


	    System.out.println();
	}
	
	public static void drawStar() {
	    int n = 13;
	    int drawN = n - 1;
	    for (int i = 1; i <= drawN; i++) {
	        drawRow(n, i);
	    }
	    for (int spaces = 1; spaces <= (n / 2) + n % 2; spaces++) {
	        System.out.print(" ");
	    }
	    for (int i = 1; i <= n; i++) {
	        System.out.print("*");
	    }
	    System.out.println();
	    for (int i = drawN; i >= 1; i--) {
	        drawRow(n, i);
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		star.drawStar();
		
		
	

	}

}
