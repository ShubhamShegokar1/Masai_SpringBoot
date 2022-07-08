import java.util.Arrays;
import java.util.Scanner;

public class Triplet_sum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int test=sc.nextInt();
		
		for(int l=0;l<test;l++)
		{
		int n=sc.nextInt();	
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);


		boolean flag=false;
		for(int i=0;i<n && flag==false;i++)
		{
			int sum=0;
			for(int j=i+1;j<n && flag==false;j++)
			{
		       sum=arr[i]+arr[j];
		       int left=0;
		       int right=n-1; 
		       while(left<=right)
		       {
		    	   int mid=(left+right)/2;
		    	   if(arr[mid]<sum)
		    	   {
		    		   left=mid+1;
		    	   }
					if(arr[mid]>sum)
					{
						 right=mid-1;
					}
					if(arr[mid]==sum)
					{
						flag=true;
						System.out.println(1);
						break;
					}
		       }
			}
		}
		
		// 1 2 3 4 5
		
		
		if(flag!=true)
		{
			System.out.println(0);
		}
		
		}
		

	}
}
