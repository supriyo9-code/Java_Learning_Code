class prob4
{
	public static void main(String[] args)
	{
		double Mrp,d1,d2,d3;
		Mrp=450;
		d1=30;
		d2=20;
		d3=10;
		
		double TD1=Mrp*d1/100;
		double FP1=Mrp-TD1;
		double TD2=Mrp*d2/100;
		double FP2=Mrp-TD2;
		double TD3=FP2*d3/100;
		double FP3=FP2-TD3;
		if(FP3<FP1)
		{
			System.out.println("Second Shopkeeper Discount is Better Than First");
		}
		else
		{
			System.out.println("First Shopkeeper Discount is Better Than Second");
		}
	}
}