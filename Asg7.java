class game1
{
	int v1;
	int v2;
	int m1()
	{
		return v1++;
	}
}
class Asg7
{
	public static void main(String[] abc)
	{
		game1 obj1=new game1();
		obj1.v1=210;
		obj1.v2=120;
		int result=obj1.m1();
		System.out.println(result);
		System.out.println(obj1.v1);
	}
}