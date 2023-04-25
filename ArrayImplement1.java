class Array1
{
	byte a1[]=new byte[5];
	byte i;
	Array1()
	{
		a1[0]=0;
		a1[1]=0;
		a1[2]=0;
		a1[3]=0;
		a1[4]=0;
	}
	void method1(byte j)
	{
		for(i=0;i<5;i++)
		{
			a1[i]=j;
		}
	}
}
class ArrayImplement1
{
	public static void main(String[] args)
	{
		Array1 obj1=new Array1();
		byte j=10;
		obj1.method1(j);
		for(byte index=0;index<5;index++)
		{
			System.out.println("a1["+index+"]="+obj1.a1[index]);
		}
	}
}