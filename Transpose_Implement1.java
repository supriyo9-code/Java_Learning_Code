import java.util.*;
class Transpose
{
	int i,j;
	int mat1[][]=new int[3][3];
	int tmat1[][]=new int[3][3];
	Transpose()
	{
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mat1[i][j]=0;
				tmat1[i][j]=0;
			}
		}
	}
	void getinfo()
	{
		Scanner inp = new Scanner(System.in);
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("\nEnter value for mat1["+i+"]["+j+"]= ");
				if(inp.hasNextInt())
				{
					mat1[i][j]=inp.nextInt();
				}
			}
		}
	}
	void disp()
	{
		System.out.println("The Original Matrix ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(mat1[i][j]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		System.out.println("The Transpose Matrix");
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print(tmat1[i][j]);
					System.out.print(" ");
				}
				System.out.print("\n");
			}
	}
	void make_traspose()
	{
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				tmat1[i][j]=mat1[j][i];
			}
		}
	}
}
class Transpose_Implement1
{
	public static void main(String[] args)
	{
		Transpose obj=new Transpose();
		obj.disp();
		obj.getinfo();
		obj.disp();
		obj.make_traspose();
		obj.disp();
	}
}