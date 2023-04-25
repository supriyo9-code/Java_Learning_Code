import java.util.Scanner;
class problem9
{
	public static void main(String[] args)
	{
		int i;
		System.out.print("Enter your Sentence : ");
		Scanner inp=new Scanner(System.in);
		String str= new String();
		str=inp.nextLine();
		System.out.println(str.replaceAll("[aAeEiIoOuU]","*"));
	}
}