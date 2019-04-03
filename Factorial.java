
public class Factorial {

	public static void main(String[] args) {
		
		
		System.out.println(fact(9));

	}
	public static int fact(int number) {
		
			
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				return i;
			}
		}
		return 0; 
	
		
	}

}
