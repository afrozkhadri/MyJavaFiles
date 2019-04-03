import java.util.Scanner;

public class PriceAfterDiscount{
	public static int sellingPrice(int totalPrice) {
		int newPrice;
		if(totalPrice<10000) {
        	 newPrice=(int)(totalPrice-totalPrice*0.1);
        	return newPrice;
        }
        else if(totalPrice>=10000&&totalPrice<20000) {
        	 newPrice=(int)(totalPrice-totalPrice*0.2);
        	return newPrice;
        }
        else {
        	newPrice=(int)(totalPrice-totalPrice*0.25);
        	return newPrice;
        }
		
	}
public static void main(String args[]) {
int amount;
       Scanner sc=new Scanner(System.in);
        System.out.println("enter item price:");
        
       int p=sc.nextInt();
        int a=sellingPrice(p);
        System.out.println("New Amount After Discount is:"+a);
        
        
        
        
}     
}       
