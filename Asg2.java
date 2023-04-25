class game1
{
	int v1;
	int v2;
}
class Asg2 
{
	public static void main(String[] abc)
	{
		game1 obj1=new game1();
		obj1.v1=10;
		obj1.v2=20;
		obj1.v1=obj1.v2;
		System.out.println(obj1.v1);
		System.out.println(obj1.v2);
	}
}