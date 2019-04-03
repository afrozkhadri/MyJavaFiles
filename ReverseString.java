
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="afroz khadri";
		
		
		String r=new StringBuffer(s).reverse().toString();
		//System.out.println("before reverse:"+s);
		//System.out.println("after reverse:"+r);
		char[] t=s.toCharArray();
		for(int i=t.length-1;i>=0;i--) {
			System.out.print(t[i]);
		}
	}
}
		
		
		
