import java.util.Scanner;
public class Main2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test= sc.nextInt();
        for(int l=0;l<test;l++)
        {
            int n=sc.nextInt();
            int target=sc.nextInt();
            int arr[]= new int[n];
            for (int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }

            int j=0;
            boolean b= false;
            while (b==false)
            {
                int count=0;
                while(count<n)
                {
                    int ans=arr[count]-j;
                    if (ans > target)
                    {
                        b=true;
                        break;
                    }
                    count++;
                }
                if(b==true)
                {
                    j++;
                    b=false;
                }
                else
                {
                    System.out.println(j);
                    b=true;
                    break;
                }

            }
        }
    }
}
