public class Exercise50 {
    	public static void main(String args[]) {
		
		int sum=0;			
		for (int i=10; i<20; i++) {
			if (i%3==0 || i%5==0)
				{
				sum+=i;
				System.out.print(sum +", ");			
				}
		}
		System.out.println("\n");
  }
}