public class FactUsingFor {

    public static void main(String[] args) {

       
       factorial();
    }


public static void factorial() {
int num = 5;
long factorial = 1;
for(int i = 1; i <= num; ++i)
{
    
    factorial *= i;
}
System.out.printf("Factorial of %d = %d", num, factorial);
}
}



