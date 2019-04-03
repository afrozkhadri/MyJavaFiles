import java.util.Scanner;

public class Palindrome01{

    public static void main(String args[]){
        
       int number=77;
       System.out.println(isPalindrome(number));
        
    }
  
   
    public static int isPalindrome(int number) {
        int reverse = 0;
         int palindrome=number;
         
     
      if(palindrome>=100&&palindrome<1000) {
      
      
        while (palindrome!=0) {
        	
        	
        	
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        
        
       
         }
        if (number == reverse) {
            return 1;
        }
        else {
        return 0;
         
         }
         
        	
         }
    return -1;
}
}
        

    


