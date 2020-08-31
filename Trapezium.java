package pack3;
import java.util.*;

public class Trapezium {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 2 sides : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("enter height : ");
		int h = sc.nextInt();
		float area = (float)((a+b) * (h)/2f);
		System.out.println("Area of trapezium : " +area);
	}
		

	}


