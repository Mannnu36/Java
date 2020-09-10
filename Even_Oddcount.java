package pack4;
import java.util.*;
public class Even_Oddcount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size :");
		int s = sc.nextInt(); // s = 8
		int[] nums = new int[s]; // array variable
		int even = 0, odd = 0;  // variables
		System.out.println("enter "+ s +" values :");
		for(int i=0;i<s;i++)  // 0-7 -> 8 values
		{
			nums[i] = sc.nextInt(); // 1 2 3 6 7 8 9 5
		}
		for(int i=0;i<s;i++) // 0-7 -> 8 values
		{
			if(nums[i] %2 == 0)  // even number -> true
				even= even + 1 ;  // even = 0+1 = 1
			else
				odd = odd + 1 ; //  odd = 0+1 = 1
		}
		System.out.println("even number count = "+even);
		System.out.println("odd number count = "+odd);
	} }