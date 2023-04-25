class game1
{
	int v1;
	long v2;
	int m1()
	{
		v1=10-5*2/10-1;
		return v1;
	}
}
class Asg9
{
	public static void main(String[] abc)
	{
		game1 obj1=new game1();
		obj1.v1=210;
		//If here i write System.out.println(obj1.v1);  it will print v1 value 210.
		int result=obj1.m1();
		System.out.println(result);
	}
}