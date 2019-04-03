import java.util.Scanner;

public class GradeOfStudent {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//System.out.println("enter how many subj:");
	//int subjs=sc.nextInt();
	System.out.println("enter marks in maths:");
	int a=sc.nextInt();
	System.out.println("enter marks in maths:");
	int b=sc.nextInt();
	System.out.println("enter marks in maths:");
	int c=sc.nextInt();
		
		
		int per=(a+b+c)/3;
		
		if(per >= 90)
	    {
	       System.out.println("Grade A");
	    }
	    else if(per >= 70&&per<90)
	    {
	    	System.out.println("Grade B");
	    }
	    else if(per <70&&per>=50)
	    {
	    	System.out.println("Grade C");
	    }
	    
	    else
	    {
	    	System.out.println("Grade F");
	    }
		

	}

}
