public class DeeDoWhile {
    public static void main(String args[]) {
        int i = 1;
        int N = 30;
        int c1=3;
        System.out.println(numb(i,N,c1));
    }
    public static String numb(int a,int b,int c) {
    	//int temp=1;
    	//temp=a;
    	/*
        do {
        	
        	//String m=new Integer(a).toString();
            
            a+=c;
            if(a<b-c)
            System.out.print(a+" ");
            
        } while (a<b-c);
        */
        
    	
    	for(a=a+c;a<b-c;a+=c) {
    		
    			
    		
    		System.out.print(a+" ");
    	}
        String m=new Integer(a).toString();
        return m;
    }
}