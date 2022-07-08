import java.util.Scanner;
public class Main1
{
    public  static int check(int arr[], int n, long mid)
    {
        int total=0;
        int capacity=1;
        for(int i=0;i<n;i++)
        {
            total+=arr[i];
            if(total>mid) {
                total=arr[i];
                capacity++;
            }
        }
        return capacity;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test= sc.nextInt();

        for(int z=0;z<test;z++)
        {
            int n = sc.nextInt();
            int target = sc.nextInt();
            int arr[] = new int[n];
            int left = -1;
            int right = 0;
            for (int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
                right += arr[i];
                if (left < arr[i])
                {
                    left = arr[i];
                }
                //1
                //5 3
                //13 17 30 15 17
            }
            while (left <= right)
            {
                int mid = (left+right) / 2;
                int Count = check(arr, n, mid);
                if (Count > target)
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
