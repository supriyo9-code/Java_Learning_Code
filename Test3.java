class one
{
	float x,y;
	void m1()
	{
		double v=20.43;
		x=y++;
		y=++x;
		System.out.println("x= "+x+"y= "+y);
	}
}
class Test3
{
	public static void main(String[] args)
	{
		one w=new one();
		w.m1();
	}
}