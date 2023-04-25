class Prob7
{
	public static void main(String[] args)
	{
		double Cp,Sp,P1,L1,Profit,Loss;
		Cp=450;
		Sp=490;
		P1=Sp-Cp;
		Profit=(P1*100)/Cp;
		L1=Sp-Cp;
		Loss=(L1*100)/Cp;
		if(Sp>Cp)
		{
			System.out.println("Profit percentage= "+Profit);
		}
		else
		{
			System.out.println("Loss Percentage= "+Loss);
		}
	}
}