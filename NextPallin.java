public class NextPallin 
{

	public static void main(String[] args) 
	{
		int a=palin(131);	
		System.out.println(a);
	
	}
	public static int palin(int number) {
		
		int rev=0;	
				
			boolean flag=true;
			while (number!=0)
			{
		   
			rev=reverse(number);
			System.out.println(rev);
			
			
			if(rev==number) {
				flag=false;
				number++;
			}
			else {
				number=rev-(number+100+number%10);
			    System.out.println(number);
				
				
			}
			return number;
			}
			
		return 0;			
						
	}								
	private static int reverse(int num) {
		int rev=0;
		while(num>0){
			rev=rev*10+num%10;
			num=num/10;
		}
		return rev;
	}
			
		
		
	}

	
		
		
		

