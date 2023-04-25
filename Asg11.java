class game1
{
	int v1;
	long v2;
	long m1(int w1,int w2)
	{
		v1=w1;
		v2=w2;
		return (v1+v2);
		
	}
}
class Asg11
{
	public static void main(String[] abc)
	{
		game1 obj1=new game1();
		long result=obj1.m1(12,20);//its shows compiler error long cannot change int.
		System.out.println(result);
	}
}