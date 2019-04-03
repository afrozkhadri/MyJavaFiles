
public class RussianMultiplication{
	
	
	
	
	
	 
	
	   
	     public static int russianM(int a, int b) 
	    { 
	        
	        int result = 0;   
	   
	       
	        while (b > 0) 
	        { 
	            
	             if ((b & 1) != 0) 
	                 result = result + a; 
	   
	            
	            a = a << 1; 
	            b = b >> 1; 
	        } 
	        return result; 
	    } 

	public static void main(String[] args) {
		
		        System.out.println(russianM(355, 465)); 
		        System.out.println(russianM(20, 10)); 
		    } 
		}
		  

	


