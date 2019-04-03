public class AverageWordLength {  
    	public static void main(String[] args) {
    		System.out.println(AverageWordLength.getAverageWordLength("Hi mom"));
    		System.out.println(AverageWordLength.getAverageWordLength("hi everyone"));
    		System.out.println(AverageWordLength.getAverageWordLength("how are you"));
    	
    }
    public static int getAverageWordLength(String str) {
       if(str==null) {
    	   return -1;
       }
       else if(str=="") {
    	   return 0;
       }
        String[] strArray = str.split(" ");
        float totalChars = 0;
        for(String s : strArray){
            totalChars += s.length();
        }
        float words = strArray.length;
        int averageWordLength = (int)(totalChars/words);
        
		return averageWordLength;
    }
}