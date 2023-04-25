import java.util.*;
class NameParttern
{
	public static void main(String[] args)
	{
		int i;
		System.out.println("Enter Your Name");
		Scanner inp=new Scanner(System.in);
		String name=inp.nextLine();
		for(i=1;i<=name.length();i++)
		{
			System.out.print(name.charAt(i-1));
			System.out.print("\n");
		}
	}
}