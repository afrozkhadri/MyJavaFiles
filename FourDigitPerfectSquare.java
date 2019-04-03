import java.util.Scanner;

public class FourDigitPerfectSquare {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter four digit number:");
		int b=sc.nextInt();
	
		if(b>999&&b<10000) {
			double c=Math.sqrt(b);
			int k= (int) (c*c);
		
		if(k==c*c) {
			if(k==even(b)) {
				
			System.out.println(c);
			System.out.println("a even perfect square");
		}
			else {
				System.out.println("not even perfect square");
						
			}
			
		}
			else {
				System.out.println("not perfect square");
			
		}
		}
		else {
			System.out.println("not 4 digit number");
		}
		
	}

	private static int even(int d) {
		if(d%2==0) {
			return d;
			
		}
				
		return 0;
	}
	
}
