import java.util.*;
class product1 
{
	int i,j,k,r,m;
	int mat1[][]=new int[3][3];
	int mat2[][]=new int[3][3];
	int mat3[][]=new int[3][3];
	product1()
	{
		k=3;
		m=3;
		r=0;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mat1[i][j]=0;
				mat2[i][j]=0;
				mat3[i][j]=0;
			}
		}
	}
	void getinfo()
	{
		Scanner inp=new Scanner(System.in);
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("\nInput value for mat1["+i+"]["+j+"] = ");
				if(inp.hasNextInt())
				{
					mat1[i][j]=inp.nextInt();
				}
				System.out.print("\n");
			}
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("\nInput value for mat2["+i+"]["+j+"] = ");
				if(inp.hasNextInt())
				{
					mat2[i][j]=inp.nextInt();
				}
				System.out.print("\n");
			}
		}
	}
	void disp()
	{
		System.out.println("The matrix1  ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(mat1[i][j]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		System.out.println("The matrix2  ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(mat2[i][j]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
		System.out.println("\nThe Resultant Matrix  ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(mat3[i][j]);
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
	void make_product()
	{
		for(i=0;i<k;i++)
		{
			for(j=0;j<m;j++)
			{
				for(r=0;r<m;r++)
				{
					mat3[i][j]=mat3[i][j]+(mat1[i][r]*mat2[r][j]);
				}
			}
		}
	}
}
class Product_Implement1
{
	public static void main(String[] args)
	{
		product1 ob=new product1();
		ob.disp();
		ob.getinfo();
		ob.disp();
		ob.make_product();
		ob.disp();
	}
}