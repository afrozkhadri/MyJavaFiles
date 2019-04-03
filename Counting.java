
public class Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	




    
        String text = "Afroz Khadri";
        int vowels = 0;
        int consonants=0;
        int digits=0;
        text = text.toLowerCase();
        for(int i = 0; i < text.length(); ++i)
        {
            char ch = text.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            else if(ch>='a'&&ch<='z') {
            	++consonants;
            }
            else if(ch>='0'&&ch<='9') {
            	++digits;
            }
          

       
    }
        System.out.println(vowels);
        System.out.println(consonants);
        System.out.println(digits);
        
	}
}

