import java.util.*;
class CaseCheck
{
	public static void main(String[] args)
	{
		char ch;
		System.out.println("Enter a Character : ");
		Scanner inp=new Scanner(System.in);
		ch=inp.next().charAt(0);
		if(Character.isUpperCase(ch))
		{
			System.out.println(ch+" is a upper case character");
		}
		else
		{
			System.out.println(ch+" is a lower case character");
		}
		
	}
}