import java.util.*;
class fab
{
	public static void main(String[] args)
	{
		int trem,a=0,b=1,c;
		System.out.println("Enter term : ");
		Scanner inp=new Scanner(System.in);
		trem=inp.nextInt();
		for(int i=1;i<=trem;i++)
		{
			c=a+b;
			System.out.println(" "+c);
			a=b;
			b=c;
		}
	}
}