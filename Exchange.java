
public class Exchange {
	public static void main(String[] args) {
		String st="zyxxxx";
		String str="";
		for(int i=0;i<=st.length()-1;i++) {
			char ch=st.charAt(i);
			ch=cipherText(ch);
			str=str+ch;
		}
		System.out.println(str);
	}
	private static char cipherText(char ch) {
		int num=(int)ch;
		int extra=num-97;
		num=num+25-(2*extra);
		return (char)num;
		
	}

}
