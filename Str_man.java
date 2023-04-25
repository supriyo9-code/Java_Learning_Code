import java.util.Scanner;
class Str_man
{
    public static void main(String[] args)
    {
        int i;
        System.out.println("Enter a Sentence Here : ");
        Scanner inp=new Scanner(System.in);
        StringBuffer str=new StringBuffer();
        str.append(inp.nextLine());
        for(i=0;i<str.length();i++)
        {
            Character ch=str.charAt(i);
            if(ch>='A' && ch<='z')
            {
                str.replace(i,i+1,Character.toLowerCase(ch)+"");
            }
            if(ch>='a' && ch<='z')
            {
                str.replace(i,i+1,Character.toUpperCase(ch)+"");
            }
            
        }
        System.out.print(str);
    }
}