class one
{
	float x;
	char y;
	one()
	{
		x=5.1F;
		y='T';
	}
	void m1()
	{
		double v=65.56;
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
class Test10
{
	public static void main(String[] args)
	{
		one w=new one();
		one p=new one();
		System.out.println("w.x= "+w.x+"w.y= "+w.y);
		w.m1();
		p.m2();
		System.out.println("p.x= "+p.x+"p.y= "+p.y);
	}
}