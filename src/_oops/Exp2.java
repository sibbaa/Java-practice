package _oops;

public abstract class Exp2 
{
	abstract void show();
	void print()
	{
		System.out.println("print() printed");
	}
}
  class Bar extends Exp2
{
	void show()
	{
		System.out.println("Show");
	}
	void display()
	{
		System.out.println("display()");
	}
	public static void main (String args[])
	{
		Bar ob=new Bar();
		ob.print();
		ob.display();
		ob.show();
		
		
	}
}