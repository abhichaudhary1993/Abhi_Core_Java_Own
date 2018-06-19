package IntroPrograms;

public class Star_1 {
	
	public static void drawStar() {
		int n = 9 ;
		int draw_n = n-1 ; 
		int space;
		
		for(int i =1 ; i <= draw_n ;i++) {
			drawRow(n,i);
		}
		
		for(space = 1 ; space<=(n/2)+n % 2 ; space++) {
			System.out.print("  ");
		}
		for( int i = 1 ; i<=n ; i++) {
			System.out.print("*");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
