package pack4;

class Outer_class
{
	int num = 10;
	
	private class Inner_class
	{
		public void print()
		{
			System.out.println("this is inner class");
			
		}
	}
     
	void display_Inner()
	{
		Inner_class obj = new Inner_class();
		obj.print();
	}

public class Innerclass {

	public void main(String[] args) 
		{
			Outer_class obj = new Outer_class();
			obj.display_Inner();
		}
		

	}
	
	
	

}
