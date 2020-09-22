package pack4;
import java.util.*;
public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number :");
		int n1 = sc.nextInt();// n1 = 100
		// to check numbers from 1 to 100
		for(int i=1; i<=n1 ; i++) // i = 4
		{
			int c=0;  
		
			for(int n = i; n>=1; n--) 
			{
				if(i%n==0)  
				{
					c= c+1; 
				}
			}	
			if(c==2)
				System.out.print(i+" ");  
		} 
	}  }