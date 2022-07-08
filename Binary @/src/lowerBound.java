import java.util.Arrays;
import java.util.Scanner;

public class lowerBound 
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
		int mid=0;
		boolean flag= false; 
		while(left<=right)
		{
			mid=(left+right)/2;
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
				while(mid>0 &&  arr[mid]==arr[mid-1] )
				{
						mid--;
				}
				System.out.println(mid);
				break;
			}
			
		}
		
		if(flag==false)
		{
			System.out.println(-1);
		}
		

	}
}
