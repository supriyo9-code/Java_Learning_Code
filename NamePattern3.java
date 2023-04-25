import java.util.*;
class NamePattern3
{
	public static void main(String[] args)
	{
		int i,j;
		System.out.println("Enter Your Name : ");
		Scanner inp=new Scanner(System.in);
		String name=inp.nextLine();
		System.out.print("\n");
		for(i=name.length();i>=1;i--)
		{
			for(int k=name.length();k>i;k--)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(name.charAt(j-1));
			}
			System.out.print("\n");
		}
	}	
}