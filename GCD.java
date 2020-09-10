package pack4;
import java.util.*;
public class GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 numbers: ");
		int n1 = sc.nextInt(); // n1 = 12
		int n2 = sc.nextInt(); // n2 = 24
		int gcd = 1;
		for(int i = 1; i <= n1 && i <= n2; i++  )  //  i = 13 -> false
		{
			if( n1%i == 0 && n2%i == 0)     // 12%12 ==0 && 24%12 == 0
				gcd = i;     // gcd = 12				
		}
System.out.println("GCD = "+gcd);  // gcd = 12
	} }