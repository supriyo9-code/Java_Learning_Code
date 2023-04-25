class game1
{
	int v1;
	long v2;
	int m1()
	{
		v1=10/5+2/10-1;
		return v1;
	}
}
class Asg10
{
	public static void main(String[] abc)
	{
		game1 obj1=new game1();
		obj1.v1=210;
		int result=obj1.m1();
		System.out.println(result);
	}
}