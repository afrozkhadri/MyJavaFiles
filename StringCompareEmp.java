
public class StringCompareEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="HELLO WORLD";
		String t="HELLOWORLD";
		Object objstr=s;
		System.out.println(s.compareTo(t));
		System.out.println(s.compareToIgnoreCase(t));
		System.out.println(s.compareTo(objstr.toString()));
	}

}
