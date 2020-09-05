package pack4;
import java.util.*;

public class Sum_ofdigits {

	public static void main(String[] args) 
	{
	    Scanner.obj = new Scanner(System.in);
	    System.out.println("enter number : ");
	    int n = obj.nextInt();
	    int sum = (n!=0)
	    		{
	    	       int rem = n%10;
	    	       sum = sum+4;
	    	       n = n/10;
	    	       
	    		}

	}

}
