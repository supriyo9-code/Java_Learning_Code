class One
{
	float x,y;
	One()
	{
		x=5.1;
		y=8.5;
	}
	void m1()
	{
		double v=20.43;
		x=(float)v;
		y=(byte)v;
		System.out.println("x= "+x+"y= "+y);
	}
}
class Test7
{
	public static void main(String[] args)
	{
		One w=new One();
		System.out.println("x= "+w.x+"y= "+w.y);
		w.m1();
	}
}