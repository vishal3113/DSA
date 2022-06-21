//Declaration of the variable in the array
// int a[];
// int[] a;
// There are two types in which we declare our variable in array;
import java.util.*;

public class Array_initialize{
    public static void main(String args[])
    {
        // initialization of the n var;
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        n=sc.nextInt(); 
        int a[]=new int[n];
        System.out.println("Enter the Elements of the array:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Elements are:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+"-");
        }
        
    }
}