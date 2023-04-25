import java.util.Scanner;
class Rev_Str
{
	public static void main(String[] args)
	{
		System.out.println("Enter A Sentence : ");
		Scanner sc=new Scanner(System.in);
		StringBuffer str=new StringBuffer();
		str.append(sc.nextLine());
		str.reverse();
		System.out.println(str);
		
	}
}