/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author supri
 */
public class newJavaFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        int i,j,search=13;
        int a[][]=new int[2][3];
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=i+10+j;
                System.out.println(a[i][j]+"When i="+i+"and j= "+j);
            }//End of Inner For loop.
        }//End Of Outer for loop
        //Searching an element from 2D array using Linear search method
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                if(a[i][j]==search)
                {
                    System.out.println("Element Found");
                    System.out.println("Row= "+i+"Column= "+j);
                }
            }
        }
    }
}
