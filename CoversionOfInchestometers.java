import java.util.Scanner;

public class CoversionOfInchestometers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      
      System.out.println("enter inches to be converted:");
      double inches=sc.nextDouble();
      double meters=inches/39.3701;
      System.out.println("meters:"+Math.round(meters));
      
	}

}
