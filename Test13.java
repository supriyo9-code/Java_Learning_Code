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
		x=y<'B';
	}
}
class Test13
{
	public static void main(String[] args)
	{
		one w=new one();
		System.out.println("w.x= "+w.x+"w.y= "+w.y);
		w.m1();
		System.out.println("w.x= "+w.x+"w.y= "+w.y);
	}
}