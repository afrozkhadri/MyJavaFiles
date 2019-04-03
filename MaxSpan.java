import java.util.HashMap;

import java.util.Map;


public class MaxSpan {

	public static int findMaxFrequency(int[] arr) {
	
		int[] a = { 1,1,1,1,1,1, 2, 2, 3,3,3,3 };

	        
		    int max = 0 ; int chh = 0;
		    int count[] = new int[a.length];
		    for(int i = 0 ; i <a.length ; i++) {
		        int ch = a[i];
		        count[ch] +=1 ;
		    }//for

		    for(int i = 0 ; i <a.length ;i++)  {
		        int ch = a[i];
		        if(count[ch] > max) {max = count[ch] ; chh = ch ;}
		    }//for
		        
	
            
        




	return chh;
	
}


public static void main(String[] args) {


		int[] array = { 1,1,1,1,1,1, 2, 2, 3,3,3,3 };
	
int b=findMaxFrequency(array);
	System.out.println(b);

	}

}