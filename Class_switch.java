
package pack2;
import java.util.*;
public class Class_switch 
{
  public static void main(String[] args)
  {
	  Scanner obj = new Scanner(System.in);
	  System.out.println("enter 2 numbers:");
	  int a = obj.nextInt();
	  int b = obj.nextInt();
	  System.out.println("1.Addition");
	  System.out.println("2.Substraction");
	  System.out.println("3.multiplication");
	  System.out.println("4.Division");
	  System.out.println("enter choice[1..4]:");
	  int ch = obj.nextInt();  // 1
	  switch(ch)
	  {
	  case 1: 
		  System.out.println("addition = "+(a+b));
		  break;
	  case 2:
		  System.out.println("substraction = "+(a-b));
		  break;
	  case 3:
		  System.out.println("multiplication = "+(a*b));
		  break;
	  case 4:
		  System.out.println("divition = "+(a/b));
		  break;
	  default:
		  System.out.println("invalid choice");		  
	  }
  }
}