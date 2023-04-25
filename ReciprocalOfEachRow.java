import java.util.Scanner;
class Reciprocal
{
	int i,j,SumRow,SumCol,SumRowProduct,SumColProduct;
	double Rp;
	int size1=0,size2=0; 
	Scanner inp1=new Scanner(System.in);
	System.out.print("Enter Value For Row size matrix : ");
	size1=inp1.nextInt();
	System.out.print("Enter Value For Column size matrix : ");
	Size2=inp.nextInt();
	int mat1[][]=new int[size1][size2];
	//int mat2[][]=new int[3][3];
	Reciprocal()
	{
		SumRow=0;
		SumCol=0;
		SumRowProduct=1;
		SumColProduct=1;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mat1[i][j]=0;
				//mat2[i][j]=0;
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
				System.out.print("\nEnter value for mat1["+i+"]["+j+"] = ");
				if(inp.hasNextInt())
				{
					mat1[i][j]=inp.nextInt();
				}
			}
		}
		/*for(i=0;i<Row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print("\nEnter value for mat2["+i+"]["+j+"] = ");
				if(inp.hasNextInt())
				{
					mat2[i][j]=inp.nextInt();
				}
			}
		}*/
	}
	void disp()
	{
		System.out.println("The Matrix1  ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(mat1[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		/*System.out.println("\nThe Matrix2  ");
		for(i=0;i<Row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.print(mat2[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}*/
	}
	void makeReciprocal()
	{
		for(i=0;i<3;i++)
		{
			SumRow=0;
			SumRowProduct=1;
			for(j=0;j<3;j++)
			{
				SumRow=SumRow+mat1[i][j];
				SumRowProduct=SumRowProduct*mat1[i][j];
				Rp=SumRow/SumRowProduct;
			}
			System.out.println("Sum of "+(i+1)+" Row "+SumRow);
			System.out.println("Product of "+(i+1)+" Row "+SumRowProduct);
			System.out.println("Reciprocal of "+(i+1)+" Row "+Rp);
		}
		for(i=0;i<3;i++)
		{
			SumCol=0;
			for(j=0;j<3;j++)
			{
				SumCol=SumCol+mat1[j][i];
			}
			System.out.println("Sum of "+(i+1)+" Column "+SumCol);
		}
	}
}
class ReciprocalOfEachRow
{
	public static void main(String[] args)
	{
		Reciprocal obj=new Reciprocal();
		obj.disp();
		obj.getinfo();
		obj.disp();
		obj.makeReciprocal();
		obj.disp();
	}
}