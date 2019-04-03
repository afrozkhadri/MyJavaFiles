
public class RemoveAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="hye afroz how are you!";
		System.out.println(removeChar(a,3));
	}
	public static String removeChar(String b,int pos) {
		return b.substring(0, pos) + b.substring(pos+1);
		
	}

}
