class Digi_cam
{
	public static void main(String[] args)
	{
		double Mrp,Dis,ST,Price,A,B;
		Mrp=30000;
		Dis=10;
		ST=6;
		A=Mrp*Dis/100;
		Price=Mrp-A;
		B=Price*ST/100;
		Price+=B;
		System.out.println("Final Price Of Digital camera= "+Price);
	}
}