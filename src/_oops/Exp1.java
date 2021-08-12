package _oops;

class B
{
	void Ab(int y)
	{
		System.out.println("Ab"+   y);
		
	}
	void Gf(int x)
	{
		System.out.println("Gf"+  x);
	}
	
}
class Exp1 extends  B
{
	void Cd()
	{
		System.out.println("CD");
	}
	void Bc()
	{
		super.Gf(66);
		this.Cd();
		this.Ab(20);
		System.out.println("Bc");
	}
	public static void main(String args[])
	{
		Exp1 ob=new Exp1();
		
		ob.Bc();
		
		
	}
	
}