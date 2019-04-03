
public class Max3Num01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=42;
		int n2=6;
		int n3=-1;
		System.out.println(getMaxNumber(n1,n2,n3));
		

	}
	public static int getMaxNumber(int num1,int num2,int num3) {
		if(num1<=0||num2<=0||num3<=0) {
			return -1;
		}
	int max=num1;
	if(num2>max) {
		max=num2;
	}
	if(num3>max) {
		max=num3;
	
	}
	return max;
	}
}
