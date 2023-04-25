class bubbleStr
{
	public static void main(String[] args)
	{
		int s1[]={32,51,27,85,66,23,13,57},temp,i,j;
		for(i=0;i<8;i++)
		{
			for(j=0;j<7;j++)
			{
				if(s1[j]>s1[j+1])
				{
					temp=s1[j+1];
					s1[j+1]=s1[j];
					s1[j]=temp;
				}
				System.out.println("At the end of pass= "+j);
				for(i=0;i<8;i++)
				{
					System.out.println("s1[["+i+"]= "+s1[i]);
				}
			}
			System.out.println("Final Output");
			for(i=0;i<8;i++)
			{
				System.out.println("s1["+i+"]= "+s1[i]);
			}
		}
	}
}