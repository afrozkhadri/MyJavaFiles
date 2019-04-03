import java.util.Scanner;

public class EvenOrOdd
{ 
      
// Function to count digits 
public static int countEvenOdd(int n) 
{ 
    int evenCount = 0; 
    int oddCount = 0; 
    while (n > 0)  
    { 
        int rem = n % 10; 
        if (rem % 2 == 0) 
            evenCount++; 
        else
            oddCount++; 
        n = n / 10; 
    } 
    System.out.println ( "Even count : " +  
                              evenCount); 
    System.out.println ( "Odd count : " +  
                              oddCount); 
    if (evenCount % 2 == 0 &&  
         oddCount % 2 != 0) 
        return 1; 
    else
        return 0; 
} 
  
    // Driver Code 
    public static void main (String[] args)  
    { 
  
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number:");
    int n=sc.nextInt();
    
    int t = countEvenOdd(n); 
      
    
    } 
} 