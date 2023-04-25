import java.util.*;
class Aphabett
{
	public static void main(String[] args)
	{
		int choice=0;
		System.out.print("Enter a Character/Alphabet : ");
		Scanner inp=new Scanner(System.in);
		char Alphabet=inp.next().charAt(0);
		char temp1=Character.toUpperCase(Alphabet);
		char temp2 = Character.toLowerCase(Alphabet);
		System.out.print("For Uppercase type - 1"+" For Lowercase - 2 :------->");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt())
		{
			choice=sc.nextInt();
		}
		switch(choice)
		{
		case 1:
			System.out.println(temp1);
			System.out.println("ASCII VALUE : "+(int)temp1);
			break;
		case 2:
			System.out.println(temp2);
			System.out.println("ASCII : "+(int)temp2);
			break;
		}
	}
}