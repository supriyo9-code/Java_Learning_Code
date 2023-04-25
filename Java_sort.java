import java.util.*;
class A
{
	int x[]=new int[8],i,size,j,temp;
	A()
	{
		x[0]=0;
		i=0;
		size=8;
	}
	void getifo()
	{
		System.out.println("Enter values in the array : ");
		for(i=0;i<size;i++)
		{
			Scanner info=new Scanner(System.in);
			System.out.print("Enter value for index= "+i+"-->");
			if(info.hasNextInt())
			{
				x[i]=info.nextInt();
			}
		}
	}
	void putinfo()
	{
		System.out.println("You have entered : ");
		for(i=0;i<size;i++)
		{
			System.out.println("x["+i+"]= "+x[i]);
		}
	}
	void sortinfo()
	{
		for(i=0;i<size;i++)
		{
			for(j=0;j<size-1;j++)
			{
				if(x[j]>x[j+1])
				{
					temp=x[j+1];
					
					x[j+1]=x[j];
					x[j]=temp;
				}
			}
		}
	}
}
class Java_sort
{
	public static void main(String[] args)
	{
		A obj=new A();
		obj.getifo();
		obj.putinfo();
		obj.sortinfo();
		obj.putinfo();
	}
}