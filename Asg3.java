class game1
{
	int v1;
	long v2;
}
class Asg3
{
	public static void main(String[] abc)
	{
		game1 obj1=new game1();
		obj1.v1=210;
		obj1.v2=120;
		obj1.v2=obj1.v1;
		System.out.println(obj1.v1);
		System.out.println(obj1.v2);
	}
}