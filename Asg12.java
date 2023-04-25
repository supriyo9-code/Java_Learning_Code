class game1
{
	int v1;
	long v2;
	int m1(int w1,int w2)
	{
		v1=w1;
		v2=w2;
		return(v1+v2);
	}
}
class Asg12
{
	public static void main(String[] abc)
	{
		game1 obj1=new game1();
		long result=obj1.m1(12,20);// Out put will be compiler error because long can not convert into int also we take method in int 
		System.out.println(result);
	}
}