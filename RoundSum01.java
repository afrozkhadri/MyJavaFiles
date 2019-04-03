
public class RoundSum01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a1=23,b1=34,b3=69;
		System.out.println(sumOfMultiples(a1,b1,b3));
		

	}
	public static int sumOfMultiples(int i1,int i2,int i3) {
		if(i1<=0||i2<=0||i3<=0) {
			return -1;
		}
		if(i1%10!=0) {
			i1=((i1/10)+1)*10;
		}
		if(i2%10!=0) {
			i2=((i2/10)+1)*10;
		}
		if(i3%10!=0) {
			i3=((i3/10)+1)*10;
		}
		return i1+i2+i3;
		
	}

}
