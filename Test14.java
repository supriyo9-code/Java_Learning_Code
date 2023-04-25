class one
{
	byte x,y,z;
	one()
	{
		x=3;
		y=4;
		z=0;
	}
	void m1()
	{
		z=x&y;
		System.out.println("x= "+x+"y= "+y+"z= "+z);
	}
}
class Test14
{
	public static void main(String[] args)
	{
		one w=new one();
		w.m1();
	}
}