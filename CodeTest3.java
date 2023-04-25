class Base1
{
	final int x;
	Base1()
	{
		x=10;
	}
	void m1()
	{
		System.out.println("I am method of the Base1 class");
		System.out.println("x= "+x);
	}
}
class Child1 extends Base1
{
	int y;
	Child1()
	{
		y=10;
	}
	void m1()
	{
		x=x+25;
		System.out.println("I am method of the Child1 class");
		System.out.println("x= "+x+"y= "+y);
	}
}
class CodeTest3
{
	public static void main(String args[])
	{
		Base1 ob2=new Base1();
		Child1 ob1=new Child1();
		ob1.m1();
	}
}