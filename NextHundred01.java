public class NextHundred01 {
	public static void main(String[] args) {
		//Add your code here
 int num = 123;
        System.out.println(getNextMultipleOf100(num));
		
	}
	
	public static int getNextMultipleOf100(int num) {
		//Add your code here
if(num <= 0 )
            return -1;

        while(num % 100 != 0){
            ++num;
        }
        return num;

	}
}