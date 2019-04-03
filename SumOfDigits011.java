import java.util.Scanner;

public class SumOfDigits011{ 
      
   
    public static int getSumOfDigits(int num) 
    {     
        int sum = 0;
        if(num<=10||num>99) {
        	return 0;
        }
       
        
       while(num!=0) {
        	sum = sum + num % 10; 
            num = num/10; 
        } 
        	
        return sum;
    
    } 
    
  
    
    public static void main(String[] args) 
    { 
       
        int n=99;
        
       
  
        System.out.println(getSumOfDigits(n)); 
    } 
} 


