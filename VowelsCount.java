
public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line="Talent sprInt";
		
		
			
	
		getVowel(line);
	    
}
	public static void getVowel(String n) {
		
		int vowels=0;
		n=n.toLowerCase();
		for(int j=0;j<n.length()-1;j++) {
			char ch=n.charAt(j);
			if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u') {
	                ++vowels;
		
	}
	
		}
	System.out.println(vowels);
}
	}

	