import java.util.*;
class NamePattern2
{
	public static void main(String[] args)
	{
		int i=0,j=0;
		System.out.println("Enter Your Name : ");
		Scanner inp=new Scanner(System.in);
		String name=inp.nextLine();
		for(i=name.length();i>=1;i--)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(name.charAt(j-1));
			}
			System.out.print("\n");
		}
	}	
}