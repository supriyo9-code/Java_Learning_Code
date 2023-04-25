class game1
{
	int v1;
	long v2;
	int m1()
	{
		return ++v1;
	}
}
class Asg8
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