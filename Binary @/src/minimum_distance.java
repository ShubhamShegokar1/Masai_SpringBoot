import java.util.Arrays;
import java.util.Scanner;

public class minimum_distance
{

	private static boolean feasible(int mid, int[] arr, int n, int k)
	{
		int elements=1;
		int pos=arr[0];
		boolean b=false;
		for(int i=0;i<n;i++)
		{
			if(arr[i]-pos>=mid)
			{
				pos=arr[i];
                elements++;
			}
		}
        return b;
	}
	public static  int Distance(int arr[],int n , int k)
	{
       int distance=0;
		Arrays.sort(arr);
        int result=-1;
        int left=1;
        int right =arr[n-1];
        //Binary Search

		while(left<=right)
		{
			int mid=(left+right)/2;
			if(feasible(mid,arr,n,k))
			{
				//distance=max(distance,mid);
				left=mid+1;
			}
			else
			{
				right=mid;
			}
		}
		return  distance;
	}


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test=sc.nextInt();
		for(int l=0;l<test;l++)
		{
			int n=sc.nextInt();	
			int k=sc.nextInt();
			int arr[]= new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
		}
	//	int ans=Distance(int arr[],int n ,int k);
	//	System.out.println(Distance(arr,n,k));
	}
}
