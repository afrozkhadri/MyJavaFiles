//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
 
public class Fibonacci_NthTerm 
{
    public static void main(String[] args) //throws IOException
    {
        //System.out.print("\nEnter the value of n : ");
       // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int n=4;
       //Integer.parseInt(br.readLine());
        System.out.println(+getNthTermOfFibonacciSeries(n));
         
    }
    public static int getNthTermOfFibonacciSeries(int nthTerm)
    {
        if(nthTerm==1)
        {   
            return 0;
        }
        if(nthTerm==2)
        {
            return 1;
        }
        if(nthTerm<=0) {
        	return -1;
        }
        return getNthTermOfFibonacciSeries(nthTerm-1)+getNthTermOfFibonacciSeries(nthTerm-2);
         
    }
 
}