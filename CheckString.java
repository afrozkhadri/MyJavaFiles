class CheckString 
{ 
  public static void checkPalindrome(String s) 
  { 
   
    String reverse = new StringBuffer(s).reverse().toString(); 
  
  
    if (s.equals(reverse)) 
      System.out.println("it is palindrome"); 
  
    else
      System.out.println("Not a palindrone"); 
  } 
  
  public static void main (String[] args) 
               
  { 
    checkPalindrome("abba"); 
    
  } 
}