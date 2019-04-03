import java.util.Scanner;

public class PrimeOrNot {

	
    public static void main(String args[])
    {
        int number, i, count=0;
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a Number : ");
        number = sc.nextInt();
		System.out.println(isPrime(number));
        
    }
    public static int isPrime(int number) {
    	int count=0;
    
    for(int i=2; i<number/2; i++)
    {
        if(number%i == 0)
        {
            count++;
            break;
        }
    }
    if(count == 0)
    {
        System.out.print("This is a Prime Number");
    }
    else
    {
        System.out.print("This is not a Prime Number");
    }
    return ;

}
}

