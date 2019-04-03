public class Interchange{ 
    
    
       
     public static void main(String[] args)  
     { 
    	 
         StringBuffer s = new StringBuffer("Afroz Khadri"); 
         
         
        int l = s.length(); 
        
        
        for (int i=0; i<l; i++) 
        { 
        
        	
            Character ch = s.charAt(i); 
            
            
            if (Character.isLowerCase(ch)) 
            	
                s.replace(i, i+1, Character.toUpperCase(ch)+"");
            
            else
            	
                s.replace(i, i+1, Character.toLowerCase(ch)+""); 
             
        } 
           
         System.out.println(s);
        } 
 } 