import java.util.Scanner;

public class ConversionOfTime {
	public static void main(String args[]) {
		int hours=9;
		int minutes=50;
		int second=40;
		int addedSeconds=2000;
		int totalS=40+2000;
		
		int b=(hours*60)+(minutes)+(totalS/60);
	   
	    int hoursConverted=b/60;
	    int minutesConverted=b%60;
	    int secondsConverted=minutesConverted%6;
	    
	    
	    System.out.println(hoursConverted+" hours"+" "+minutesConverted+" "+"minutes"+" "+secondsConverted+" "+"seconds");
		
		
	}
	
	

}