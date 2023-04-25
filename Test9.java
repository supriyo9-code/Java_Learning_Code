class One
{
	float x,y;
	One()
	{
		x=5.1F;
		y=8.5F;
	}
	void m1()
	{
		double v=10.56;
		x=(float)v;
		y=(byte)v;
		System.out.println("x= "+x+"y= "+y);
	}
	void m2()
	{
		x++;
		y++;
	}
}
class Test9
{
	public static void main(String[] args)
	{
		One w=new One();
		One p=new One();
		System.out.println("w.x= "+w.x+"w.y= "+w.y);
		w.m1();
		p.m1();
		System.out.println("p.x= "+p.x+"p.y= "+p.y);
	}
}