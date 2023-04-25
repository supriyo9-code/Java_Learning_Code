import java.util.Scanner;
class prob3
{
	public static void main(String[] args)
	{
		double P,R1,R2,R3,A,CI;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter P= ");
		P=sc.nextDouble();
		System.out.print("Enter R1= ");
		R1=sc.nextDouble();
		System.out.print("Enter R2= ");
		R2=sc.nextDouble();
		System.out.print("Enter R3= ");
		R3=sc.nextDouble();
		//P=10000;
		//R1=5;
		//R2=8;
		//R3=10;
		A=P*(1+R1/100)*(1+R2/100)*(1+R3/100);
		CI=A-P;
		System.out.println("After Three Year Total Amount= "+A);
		System.out.println("Total Compund Interest= "+CI);
	}
}