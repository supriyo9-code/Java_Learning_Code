class one
{
	byte x,y,z;
	one()
	{
		x=42;
		y=37;
		z=0;
	}
	void m1()
	{
		z=(byte)(x&y);
		System.out.println("x= "+x+"y= "+y+"z= "+z);
	}
}
class Test16
{
	public static void main(String[] args)
	{
		one w=new one();
		w.m1();
	}
}