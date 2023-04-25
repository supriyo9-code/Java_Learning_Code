import java.util.*;
class Armstrong
{
	public static void main(String abcd[])
	{
		int n=0,dg_counter,temp_n,i,digit,dg_pow,dg_sum;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a number :  ");
		if(s1.hasNextInt())
		{
			n=s1.nextInt();
		}
		dg_counter=0;
		temp_n=n;
		while(temp_n>0)
		{
			dg_counter++;
			temp_n=temp_n/10;
		}
		System.out.println("The number you have entered has "+dg_counter+" digits");
		temp_n=n;
		dg_sum=0;
		while(temp_n>0)
		{
			digit=temp_n%10;
			dg_pow=1;
			for(i=1;i<=dg_counter;i++)
			{
				dg_pow=dg_pow*digit;
			}
			dg_sum=dg_sum+dg_pow;
			temp_n=temp_n/10;
			
		}
		if(dg_sum==n)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}
}