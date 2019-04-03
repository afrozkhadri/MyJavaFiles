public class test2 {
  
  public static void main(String[] args) {
     
   String email = "testmail@.mailme.com";
  
      System.out.println(maskMailID(email));
 
   }

    


    public static String maskMailID(String emai) {
    	
    	String temp="";
    	String mask="";
    	
    	int space=emai.indexOf('@');
    	temp=emai.substring(2,space );
    
    	
    	for(int i=0;i<temp.length();i++) {
    		mask+='X';
    	}
    	
    	String result=emai.substring(0,2)+mask+emai.substring(space);
    	return result;
        
      
    }

}
