// 2D Array
// 
// 
// ..........
import java.util.*;

public class Array_2D {
    public static void main(String args[])
    {
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of the rows:");
        n=sc.nextInt();
        System.out.println("Enter the number of the coloums:");
        m=sc.nextInt();
        int a[][]=new int[n][m];
        System.out.println("Enter the Elements:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
