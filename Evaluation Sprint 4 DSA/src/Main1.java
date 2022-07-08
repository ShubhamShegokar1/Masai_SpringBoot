import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        for(int l=0; l<test;l++)
        {
            int n =sc.nextInt();
            int[] arr= new int[n];
            int k=sc.nextInt();
            long left=0;
            long right=0;
            for(int i=0;i<n;i++)
            {
               arr[i]=sc.nextInt();
               right+=arr[i];
               if(arr[i]>left)
               {
                   left=arr[i];
               }
            }
            long ans=0;
            while(left<=right)
            {
                long mid=(left+right)/2;
              int number= Check(arr, n ,mid);
              if(number>k)
              {
                  ans=mid;
                  left=mid+1;
              }
              else
              {
                  right=right-1;
              }
            }
            DecimalFormat format= new DecimalFormat("#");
            System.out.println(format.format(left));


        }
    }

    private static int Check(int[] arr, int n, long mid)
    {
        int temp=1;
        int total=0;
        for(int i=0;i<n ;i++)
        {
            total+=arr[i];
            if(total>mid)
            {
                total=arr[i];
                temp++;
            }
        }
        return temp;
    }
}
