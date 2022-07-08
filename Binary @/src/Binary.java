import java.util.Arrays;
import java.util.Scanner;

public class Binary
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int target=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}

		int left=0;
		int right=n-1;
		boolean flag= false;

		while(left<=right && flag==false)
		{
			int mid=(left+right)/2;
			if(arr[mid]<target)
			{
				left=mid+1;
			}

			if(arr[mid]>target)
			{
				right=mid-1;
			}
			if(arr[mid]==target)
			{
				flag=true;
				System.out.println(1);
			}
		}

		if(flag==false)
		{
			System.out.println(-1);
		}


	}
}
