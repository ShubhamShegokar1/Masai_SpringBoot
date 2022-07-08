import java.util.Scanner;

public class Main4_copy
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
            int right=1000000000;

            boolean b=true;

            int left=0;
            int mid=0;
          for(int j=0;j<60;j++)
            {
                int ans=0;
                mid=(left+right/2);
                for (int i = 0; i < n; i++)
                {
                    if(mid>arr[i])
                    {
                        ans+=arr[i];
                    }
                    else {
                        ans += mid;
                    }
                }
                if(ans>k)
                {
                    right=mid-1;
                }
                else
                {
                    left=mid+1;
                }

            }

            System.out.println(right);
        }
    }
}
