package pack2;
import java.util.*;
public class Even_Odd 
{
	public static void main(String[] args) 
	{
	  Scanner obj = new Scanner(System.in);
	  System.out.println("enter number:");
	  int x = obj.nextInt();
	  if (x%2==0)
		  System.out.println("even number = "+x);
	  else
		  System.out.println("odd number = "+x);
	}
}