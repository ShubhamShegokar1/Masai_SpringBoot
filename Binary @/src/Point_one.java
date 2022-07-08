import java.util.Scanner;

public class Point_one 
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
		int left=0;
		int right=n-1;
		int mid=0;
		boolean flag= false; 
		while(left<=right)
		{
			mid=(left+right)/2;
			if(arr[mid]<1)
			{
				 left=mid+1;
			}

		
			if(arr[mid]==1)
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
}
