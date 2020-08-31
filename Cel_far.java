package pack3;

import java.util.Scanner;

public class Cel_far {

	private static Scanner sc;

	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
        float f,c;
        System.out.println("enter celcius temperature :");
        c=sc.nextFloat();
        f=((c*9)/5)+32;
        System.out.println("farenheit= " +f);
	}
	
	}
	


