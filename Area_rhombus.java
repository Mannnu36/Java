package pack3;
import java.util.*;

public class Area_rhombus 
{

	private static Scanner sc;

	public static void main(String[] args) 
	{
		sc = new Scanner(System.in);
		System.out.println("Enter 2 diagnols : ");
		float d1 = sc.nextFloat();
		float d2 = sc.nextFloat();
		float a = (d1*d2)*1/2;
		System.out.println("Area of rhombus " +a);
	}
		
	}


