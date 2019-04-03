import java.util.Scanner;

public class ConversionOfMinutesToYDHM {
	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Input:minutes=");
	    int tminutes=sc.nextInt();
	    int minutesinyear=365*1440;
	    int years=tminutes/minutesinyear;
	    int minutesindays=tminutes-(years*minutesinyear);
	    int days=minutesindays/1440;
	    int minutesinhour=minutesindays-(1440*days);
	    int hours=minutesinhour/60;
	    int minutes=minutesinhour-(60*hours);
	    System.out.println("Given Minutes Has"+" "+years+" "+"years"+" "+days+" "+"days"+" "+hours+" "+"hours and"+" "+minutes+" "+"minutes");
		
		
	}
	


}
