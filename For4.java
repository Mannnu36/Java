package pack2;

public class For4 {

	public static void main(String[] args) {
		
		for(int j=1;j<=5;j++)  // rows
		{
		for(int i=1; i<=j; i++)  // cols
		{
			System.out.print(i+"\t");
		}
		System.out.println();
	    }
	}
}