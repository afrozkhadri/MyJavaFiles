
public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="Hello world";
System.out.println(a.replace("w", "$$$"));
System.out.println(a.replaceFirst("d","Hy"));
System.out.println(a.replaceAll("d", "@"));

	 
	       String str = new String("Site is BeginnersBook.com");

	       System.out.print("String after replacing com with net :" );
	       System.out.println(str.replaceFirst("com", "net"));

	       System.out.print("String after replacing Site name:" );
	       System.out.println(str.replaceFirst("Beginners(.*)", "XYZ.com"));
	   }
	
	}


