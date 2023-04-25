interface intf1//Interface Definition
{
	static final int x=10;//Declaration of a constant variable
	void m1();//Declaration of a method without its body
}
class one implements intf1
{
	int y,z;
	one()//Non-parametarized constructor
	{
		y=0;
		z=0;
	}
	one(int value)//parametarized constructor
	{
		y=value;
		z=0;
	}
	public void m1()
	{
		z=x+y;
	}
	void putdata()
	{
		System.out.println("z= "+z);
	}
}
class InterfaceTest1
{
	public static void main(String[] args)
	{
		one ob1=new one(330);
		ob1.putdata();//Before calling the interface method
		ob1.m1();
		ob1.putdata();//After calling the interface method
	}
}