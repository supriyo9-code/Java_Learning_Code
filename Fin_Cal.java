class Calculate
{
	int x,y,sum,diff,diff1;
	void inputdata()
	{
		x=90;
		y=45;
	}
	void calculate()
	{
		sum=x+y;
		diff=x-y;
	}
	void outputdata()
	{
		System.out.println(sum);
		System.out.println(diff);
	}
}
class Fin_cal
{
	public static void main(String[] args)
	{
		Calculate obj=new Calculate();
		obj.inputdata();
		obj.calculate();
		obj.outputdata();
		
	}
}