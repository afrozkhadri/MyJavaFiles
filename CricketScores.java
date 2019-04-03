

import java.util.*;
public class CricketScores{
	public static void main(String[] args){
        int r=50;
        float b=80;
        
        
    
    
   
    System.out.println(r+" runs in "+b+" balls @ "+getDisplayDetails(r,b)+" per ball");
	}
   
    public static String getDisplayDetails(int runs,float ballsFaced ){
    	
        float strikeRate=((100*runs)/ballsFaced);
        String i=new Float(strikeRate).toString();
        if(balsFaced==int(k))
        return i;
        
    }

   
}