package pack1;

import java.util.Scanner;

public class Cirlearea {

	public static void main(String[] args) {
	 Scanner obj=new Scanner(System.in);
	 System.out.println("enter radius:");
	 float r= obj.nextFloat();
	 float a= 3.14F*r*r;
     System.out.println("area of circle=" +a);
	}

}
