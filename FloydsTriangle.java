//import java.util.Scanner;
public class FloydsTriangle {
    public static void main(String[] args)
    {
        int i,j,number=1,n=5;
		//Scanner inp=new Scanner(System.in);
		//System.out.println("Enter value here : ");
		//n=inp.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
    
}
