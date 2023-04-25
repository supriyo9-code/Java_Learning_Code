class game1
{
	int v1;
	long v2;
	int m1()
	{
		return v1+1;
	}
}
class Asg6
{
	public static void main(String[] abc)
	{
		game1 obj1 = new game1();
		obj1.v1=210;
		obj1.v2=120;
		byte result=obj1.m1();
		System.out.println(result);
	}
}