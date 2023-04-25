class one
{
	boolean x;
	char y;
	one()
	{
		x=false;
		y='A';
	}
	void m1()
	{
		x=y>'B';
		System.out.println("x= "+x+"y= "+y);
	}
}
class Test12
{
	public static void main(String[] args)
	{
		one w=new one();
		System.out.println("w.x= "+w.x+"w.y= "+w.y);
		w.m1();
		System.out.println("w.x= "+w.x+"w.y= "+w.y);
	}
}