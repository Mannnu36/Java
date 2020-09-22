package pack4;
import java.util.*;
public class Prime_between {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 numbers :");
		int n1 = sc.nextInt(); // 10
		int n2 = sc.nextInt(); // 20
		System.out.println("prime numbers between "+n1 +" and "+ n2+" are :");
		for(int i=n1+1; i < n2; i++ )  // i= 11, 20<20 -> f
		{
			int c=0;
			
			for(int n = i; n>=1; n--) // n= 11..1
			{
				 if(i%n==0) // 11%1 -> t
				 { c= c+1; } // c= 2
			}
			if (c==2)
				System.out.print(i+" "); // 11 13 17 19
		}

	} }
