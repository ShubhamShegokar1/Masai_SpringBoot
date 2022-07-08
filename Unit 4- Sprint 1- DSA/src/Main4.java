import java.util.Scanner;

public class Main4
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        for(int l=0;l<test;l++)
        {
            int n = sc.nextInt();
            int k=sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
            {
               arr[i] = sc.nextInt();
            }
            boolean b=true;

            int count = 1;

            while (b==true)
            {
                int ans=0;
                for (int i = 0; i < n; i++)
                {
                   if(count>arr[i])
                   {
                       ans+=arr[i];
                   }
                   else {
                       ans += count;
                   }
                }
                if(ans>=k)
                {
                    b=false;
                }
                count++;
            }
            System.out.println(count-1);
        }
    }
}
