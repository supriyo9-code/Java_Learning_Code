class game1
{
	int v1;
	long v2;
	void m1()
	{
		System.out.print(v1+v2);
	}
}
class Asg4
{
	public static void main(String[] abc)
	{
	game1 obj1=new game1();
	obj1.v1=210;
	obj1.v2=120;
	int result=obj1.m1();
	System.out.println(result);
	}
}
