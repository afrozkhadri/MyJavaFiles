
public class countBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean n1=true,n2=true,n3=false;
		System.out.println(countBoolean(n1,n2,n3));

	}

	public static boolean countBoolean(boolean a1,boolean a2,boolean a3) {
		int count=0;
		if(a1) {
			count++;
		}
		if(a2) {
			count++;
		}
		if(a3) {
			count++;
		}
		return (count>=2);
	}
}
