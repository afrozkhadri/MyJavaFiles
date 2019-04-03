import java.util.Scanner;

public class IssPrime{
public static void main(String args[]) {

	int res=0;
	 Scanner sc=new Scanner(System.in);
	System.out.println("enter the number:");
	int num=sc.nextInt();
	res=isPrime(num);
	if(res==0) {
		System.out.println("IS A PRIME NUMBER");
	}
	else {
			System.out.println(" IS NOT A PRIME NUMBER");
	}
	System.out.println();
	
}
public static int isPrime(int n)
{
	int i;
	for(i=2;i<=n/2;i++)
	{
		if(n%i!=0)
			continue;
		else
			return 1;
	}
	return 0;
}
}