import java.util.*;
class NamePattern1
{
	public static void main(String[] args)
	{
		int i,j;
		System.out.println("Enter Your Name");
		Scanner inp=new Scanner(System.in);
		String name=inp.nextLine();
		for(i=1;i<=name.length();i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(name.charAt(j-1));
			}
			System.out.print("\n");
		}
	}
}