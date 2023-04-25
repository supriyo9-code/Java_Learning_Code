class one
{
	float x,y;
	void m1()
	{
		double v=20.43;
		x=v;
		y=++x;
	}
}
class Test1
{
	
	public static void main(String[] args)
	{
		one w=new one();
		w.m1();
	}
}