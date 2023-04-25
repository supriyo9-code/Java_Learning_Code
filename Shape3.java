class Shape3
{
	public static void main(String []abcd)
	{
		int i=0,j=0,k=0,val=5,space=0;
		for(i=5,space=4;i>0;i--,space--)
		{
			for(k=1;k<=(i-1);k++)
			{
				System.out.print(" ");
			}
			for(j=1,val=5;j<=(5-space);j++)
			{
				System.out.print(val);
				val--;
			}
		System.out.print("\n");
		}
	}
}
	