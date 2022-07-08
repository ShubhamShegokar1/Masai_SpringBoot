import java.text.DecimalFormat;
import java.util.Scanner;

public class painters 
{
	public static  int sum(int arr[],int start , int end)
	{
		int total=0;
		for(int i=start;i<=end;i++)
		{
			total+=total+arr[i];
		}
		return total;
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
			int arrayBacktrack[][]= new int [k+1][n+1];
			for(int i=1;i<n;i++) {
				arrayBacktrack[1][i] = sum(arr, 0, i - i);

			}

			for(int i=0;i<k+1;i++)
			{
				for(int j=0;j<n+1;j++)
				{
					System.out.print(arrayBacktrack[i][j]+" ");
				}
				System.out.println();
			}

		}
	}
}
