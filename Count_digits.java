package pack4;
import java.util.*;
public class Count_digits {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number : ");
		int num = obj.nextInt();
		int c = 0;
		while(num!=0)
		{
			num=num/10;
			c++;
		}
		System.out.println("number of digits = "+c);
		

	}

}
