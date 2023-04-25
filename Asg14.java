class game1
{
	byte a;
	short b;
	int c;
	long d;
	long m1(byte w1,short w2,int w3,long w4)
	{
		a=w1;
		b=w2;
		c=w3;
		d=w4;
		return (a+b+c+d);
	}
}
class Asg14
{
	public static void main(String[] abc)
	{
		game1 obj1=new game1();
		byte v1=1;
		short v2=2;
		int v3=3;
		long v4=4;
		//long result=obj1.m1(v4,v3,v2,v1); if i uncomment this line it will show error because here variable position change.
		long result=obj1.m1(v1,v2,v3,v4);
		System.out.println(result);
	}
}