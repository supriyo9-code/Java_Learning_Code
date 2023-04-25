class one
{
	float x,y;
	void m1()
	{
		double v=20.43;
		x=y++;
		y=++x;
	}
}
class Test2
{
	public static void main(String[] args)
	{
		one w=new one();
		w.m1();
	}
}