import java.util.Scanner;
class VowelCounting
{
	public static void main(String[] String)
	{
		int i;
		int Vowel[]=new int[8];
		System.out.println("Enter a Sentence : ");
		Scanner inp=new Scanner(System.in);
		String Sentence=inp.nextLine();
		String str=Sentence.toLowerCase();
		for(i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a')
			{
				Vowel[0]++;
			}
			if(ch=='e')
			{
				Vowel[1]++;
			}
			if(ch=='i')
			{
				Vowel[2]++;
			}
			if(ch=='o')
			{
				Vowel[3]++;
			}
			if(ch=='u')
			{
				Vowel[4]++;
			}
			if(ch=='.')
			{
				Vowel[5]++;
			}
			if(ch==',')
			{
				Vowel[6]++;
			}
			if(ch==';')
			{
				Vowel[7]++;
			}
		}
		System.out.println("Number of A Present "+Vowel[0]);
		System.out.println("Number of E Present "+Vowel[1]);
		System.out.println("Number of I Present "+Vowel[2]);
		System.out.println("Number of O Present "+Vowel[3]);
		System.out.println("Number of U Present "+Vowel[4]);
		System.out.println("Number of . Present "+Vowel[5]);
		System.out.println("Number of , Present "+Vowel[6]);
		System.out.println("Number of ; Present "+Vowel[7]);
	}
}