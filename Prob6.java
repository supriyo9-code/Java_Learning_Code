import java.lang.Math;
class Prob6
{
	public static void main(String[] args)
	{
		double x,y,z;
		x=30;
		double a=Math.sin(x);
		y=30;
		double b=Math.cos(y);
		z=30;
		double c=Math.tan(z);
		double min;
		min=a;
		if(a<min)
		{
			min=b;
		}
		if(c<min)
		{
			min=c;
		}
		System.out.println(min);
	}
}