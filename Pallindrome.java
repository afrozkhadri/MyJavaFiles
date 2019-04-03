public class Pallindrome 
{

	public static void main(String[] args) 
	{
		palin();
	}
	public static void palin() {
		int n, b, rev = 0;
		int limit=100;
		System.out.print("Palindrome range:");
		for (int i = 1; i <= limit; i++)
		{
			n = i;
			while (n > 0)
			{
				b = n % 10;
				rev = rev * 10 + b;
				n = n / 10;
			}
			if (rev == i)
			{
				System.out.print(i + " ");
			}
			rev = 0;
		}
		
	}
	

}