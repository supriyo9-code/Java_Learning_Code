import java.util.Scanner;
class prob15
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double Math,Science,Eng,p=0,Esp=0,Mp=0;
		System.out.print("Enter obtained marks in Math :--> ");
		Math=sc.nextDouble();
		System.out.print("Enter obtained marks in Science :--> ");
		Science=sc.nextDouble();
		System.out.print("Enter obtained marks in Eng :--> ");
		Eng=sc.nextDouble();
		if(Math<=100 && Science<=100 && Eng<=100)
		{
			p=100*((Math+Science+Eng)/300);
			Esp=100*(Science+Eng)/200;
			Mp=100*Math/100;
		}
		else
		{
			System.out.println("You Enter More Then Full Marks");
		}
		if(p>=80)
		{
			System.out.println("You can admission in pure science");
		}
		else if(Esp>=80 && Mp>=60)
		{
			System.out.println("You can take admission in Bio Science not in Pure Scienc");
		}
		else if(p>=60)
		{
			System.out.println("You can take admission in Commerce only");
		}
		else
		{
			System.out.println("Not Eligible For Admission");
		}
		
	}
}