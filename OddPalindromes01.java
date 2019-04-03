
public class OddPalindromes01 {

	public static void main(String[] args) {
		int num1=1500;
		int num2=2000;
		
System.out.println(generateOddPalindromes(num1,num2));
	}
	public static String generateOddPalindromes(int start,int limit) {
		String result="";
		if(start<=0||limit<=0) {
			return "-1";
		}
		if(start>=limit) {
			return "-2";
		}
		
		for(int n=start;n<=limit;n++) {
			if(isPalindrome(n)&&isAllDigitsOdd(n)) {
				result+=n+ ",";
			}
		}
			if(result.length()==0) {
				return "-3";
		
			
		}
		
	result=result.substring(0,result.length()-1);
			
			return result;
}
	public static int reverse(int num) {
		int rev=0;
		while(num>0) {
			int r=num%10;
			rev=rev*10+r;
			num/=10;
		}
		return rev;
	}
	public static boolean isAllDigitsOdd(int num) {
		while(num>0) {
			int r=num%10;
			if(r!=0) {
				if(r%2==0) {
					return false;
					
				}
			}
			num=num/10;
		}
		return true;
	}
	public static boolean isPalindrome(int num) {
		return (num==reverse(num));
	}
	

}
