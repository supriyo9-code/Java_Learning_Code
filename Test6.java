class One
{
	float x,y;
	void m1()
	{
		double v=20.43;
		x=(float)v;
		y=(byte)v;
		System.out.println("x= "+x+"y= "+y);
	}
}
class Test6
{
	public static void main(String[] args)
	{
		One w=new One();
		w.m1();
	}
}