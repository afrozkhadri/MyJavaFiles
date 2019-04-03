import java.util.*;
public class displayMenu
{
   public static void main(String []args)
   {
       Scanner sc=new Scanner(System.in);
       int choice,num1,num2;
       double result;
       while(true)
       {
           System.out.println("01. add");
           System.out.println("02. sub");
           System.out.println("03. mul");
           
           System.out.println("04. div");
           System.out.println("05. rem");
           System.out.println("06. power");
           System.out.print("Enter Your Choice : ");
           choice=sc.nextInt();
           switch(choice)
           {
               case 1:
                        System.out.print("Enter num1:");
                        num1=sc.nextInt();
                        System.out.print("Enter num2:");
                        num2=sc.nextInt();
                        result=num1+num2;
                        System.out.println(result);
                        break;    
               case 2:  
                        
            	   System.out.print("Enter num1:");
                   num1=sc.nextInt();
                   System.out.print("Enter num2:");
                   num2=sc.nextInt();
                   result=num1-num2;
                   System.out.println(result);
                   break;   
                       
               case 3:
            	   System.out.print("Enter num1:");
                   num1=sc.nextInt();
                   System.out.print("Enter num2:");
                   num2=sc.nextInt();
                   result=num1*num2;
                   System.out.println(result);
                   break;
                  
               case 4:
                	System.out.print("Enter num1:");
                    num1=sc.nextInt();
                    System.out.print("Enter num2:");
                    num2=sc.nextInt();
                    result=num1/num2;
                    System.out.println(result);
                    break;
                    
                    
               case 5:
               	System.out.print("Enter num1:");
                   num1=sc.nextInt();
                   System.out.print("Enter num2:");
                   num2=sc.nextInt();
                   result=num1%num2;
                   System.out.println(result);
                   break;
                   
               case 6:
               	System.out.print("Enter num1:");
                   num1=sc.nextInt();
                   System.out.print("Enter num2:");
                   num2=sc.nextInt();
                   result=Math.sqrt(num1);
                   System.out.println(result);
                   break;
                   
               case 7:
                  	System.exit(0);
                      
                	
                       
            	   
               default: System.out.println("Wrong Entry");
               
            }
           
       }
      
       
   }
   
}
