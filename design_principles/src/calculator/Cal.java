package calculator;
import java.util.Scanner;

public class Cal {
	public static void main(String[] args) {
	 String yn;
     do
     {
   	  Scanner s=new Scanner(System.in);
   	  System.out.println("Enter the first no.");
   	  int no1=s.nextInt();
   	  System.out.println("Enter the second no.");
   	  int no2=s.nextInt();
   	  System.out.println("Select Symbol(+,-,*,/)");
   	  String sym=s.next();
   	  int res;
   	  switch(sym)
   	  {
   	  case "+": res=no1+no2;
           System.out.println("Additon is"+res);
           break;
           
   	  case "-": res=no1-no2;
           System.out.println("Subtraction is"+res);
           break;
           
   	  case "*": res=no1*no2;
           System.out.println("Multiplication is"+res);
           break;
           
   	  case "/": res=no1/no2;
           System.out.println("Division is"+res);
           break;
           
         default: System.out.println("Invalid Symbol");
                  break;
   	            
   	  }
   	 System.out.println("Do you want to continue(Press 'y'for yes and 'n' for no)");
   	 yn=s.next();
   	 
     }while(yn.equals("y")|| yn.equals("Y"));
     
 }


}
