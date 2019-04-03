
public class Fibonacci01 {
public static void main(String args[]) {
	System.out.println(getFibonacciSeries(30));
}
public static String getFibonacciSeries(int num) {
	if(num<0||num>40) {
		return "-1";
		
	}
	if(num==1) {
		return "0";
		
	}
	if(num==2) {
		return "0,1";
	}
	
	
	
	String result="0,1";
	int first=0;
	int second=1;
	int next;
	for(int m=0;m<num-2;m++) {
		next=first+second;
		first=second;
		
		second=next;
		result+=","+next;
	}
	return result;
}
}
