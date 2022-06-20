// Insertion of an element into a new array in which the new array have similar elements to the old array.
// Time Complexity->
import java.util.*;

public class Array2 {
    public static void main(String args[])
    {
        int n,s,v;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        n=sc.nextInt(); 
        int a[]=new int[n];
        int b[]=new int[n+1];
        System.out.println("Enter the Elements of the array:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the new value for insertion in array:");
        v=sc.nextInt();
        // INdex Value for the insertion of the new element
        System.out.println("Enter the index value for insertion:");
        s=sc.nextInt();
        for(int i=0;i<n+1;i++)
        {
            if(i<s)
            {
                b[i]=a[i];
            }
            else if(i==s)
            {
                b[i]=v;
            }
            else
            {
                b[i]=a[i-1];
            }
        }
        
        System.out.println("Elements are:");
        for(int i=0;i<n+1;i++)
        {
            System.out.print(b[i]+"-");
        }
    }
}
