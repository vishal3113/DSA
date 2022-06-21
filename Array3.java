// Deletion of an Element
// .
// .
import java.util.*;

public class Array3 {
    public static void main(String args[])
    {
        int n,s,v;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n-1];
        System.out.println("Enter the Elements of the Array");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the index value of the Element You want to Delete");
        s=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i<s)
            {
                b[i]=a[i];
            }

            else if(i==s)
            {
                continue;
            }

            else
            {
                b[i-1]=a[i];
            }
        }
        System.out.println();
        System.out.print("Elements Are:");
        System.out.println();
        for(int i=0;i<n-1;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
