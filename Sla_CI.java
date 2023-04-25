import java.lang.Math;
class Sla_CI
{
	public static void main(String[] args)
	{
		double P,R,n,A,CI;
		P=6000;
		R=5;
		n=2;
		A=P*(Math.pow((1+R/100),n));
		CI=A-P;
		if(n==3)
		{
			System.out.println(A);
		}
		else if(n==1.0)
		{
			System.out.println("First Year Interest="+CI);
		}
		else
		{
			System.out.println("Second Year Interest"+CI);
		}
		
		
	}
}