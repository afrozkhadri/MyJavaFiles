
public class CountDigits {


  
    static int countDigit(long n) 
    { 
        if (n == 0) 
            return 0; 
        return 1 + countDigit(n / 10); 
    } 
  
   
    public static void main(String[] args) 
    { 
        long n = 123456678; 
        System.out.print( + countDigit(n)); 
    } 
} 
