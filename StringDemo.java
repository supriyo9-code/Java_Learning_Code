//String handling
import java.util.*;
class StringDemo
{
	public static void main(String []xyz)
	{
		//method 1 ( string considered as an character array , which is not feasible in java
		/*char string1=new char[5];//Array 1 dimensional using data type char
		//char ch=' ';
		string1[0]="ABCDE";
		for(int i=0;i<5;i++)//taking input to the character array
		{
			//string1[i]=ch;
			System.out.println(string1);
		}
		*/
		//method 2 ( string handling using String class objects
		String obj1=new String();
		String obj2=new String();
		String result=new String();
		obj1="ABCDE";
		obj2="ABCdE";
		System.out.println(obj1);
		result=obj1.toLowerCase();
		System.out.println(result);
		result=obj1.replace('A','x');
		System.out.println(result);
		if(obj1.equals(obj2))
		{
			System.out.println("Both obj1 and obj2 are same");
		}
		else
		{
			System.out.println("obj1 and obj2 are not equal");
		}
		StringBuffer obj3=new StringBuffer("Vivekananda College");	
		StringBuffer obj4=new StringBuffer("Computer Centre");		
		System.out.println("obj3 = "+obj3);		
		obj3.append(obj4);
		System.out.println("obj3 = "+obj3);
		
	}
}