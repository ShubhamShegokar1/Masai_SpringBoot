import java.util.Arrays;
import java.util.Scanner;

public class first
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test= sc.nextInt();
        for(int l=0;l<test;l++)
        {
            int n = sc.nextInt();
            int target = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            int left=0;
            int right=1000000;
            while (left <= right)
            {
                int mid = (left+right) / 2;
//1
//8 8
//15 14 19 20 21 17 21 22
                int ans=0;
                for(int i=0;i<n;i++)
                {
                    double add=arr[i]/mid;
                    add=Math.floor(add);
                    ans+=add;


                }
                if (ans > target)
                {
                    left = mid + 1;
                }
                else
                {
                    right = mid - 1;
                }
            }
            System.out.println(left);

        }


    }
}
