import java.text.DecimalFormat;
import java.util.Scanner;

public class Main3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test=sc.nextInt();
        for(int l=0; l<test;l++)
        {
            int n =sc.nextInt();
            int[] arr= new int[n];
            int[] count= new int[1000001];
            double total=0;
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                count[arr[i]]++;
                total+=arr[i];
            }
            for(int i=0;i<10;i++)
            {
                System.out.print(count[i]+" ");
            }
            double left=0;
            double right=1000001;
           double ans=0;
           while(left<=right)
           {

           }

            DecimalFormat format= new DecimalFormat("#");
            System.out.println(format.format(ans));




        }
    }
}
