package pack3;
import java.util.*;
public class Square_not {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number :");
		int x = obj.nextInt(); // x = 25
		double sr = Math.sqrt(x); // sr = 5.0		
		if((sr - Math.floor(sr))==0) // true
		 System.out.println("Square Number ");
		else
		System.out.println("Not Square Number ");
	} }
