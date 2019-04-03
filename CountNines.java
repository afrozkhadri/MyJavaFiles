public class CountNines{
	public static void main(String args[]) {
		
		
		System.out.println(getCountNines(10, 1));

}
	public static int countAllNines() {
		return -2;
		
	}
	
	public static int getCountNines(int a,int b) {
		int nines = 0;
if(a<0&&b<0) {
	return -1;
}
		for(int i = b; i <= a; i++){
		    for(char c : String.valueOf(i).toCharArray()){
		        if(c == '9') 
		        	nines++;
		       
		    }
		    
		}
		if(nines==0)
			return -3;

	return nines;
	}
}

