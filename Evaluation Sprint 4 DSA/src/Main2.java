import java.util.Scanner;

public class Main2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        for(int l=0; l<test;l++)
        {
            int n = Integer.parseInt(sc.nextLine());
            String str=sc.nextLine();
            int[] count=new int[10];
            for(int i=0;i<n;i++)
            {
                if(str.charAt(i)=='0')
                {
                    count[0]++;
                }
                if(str.charAt(i)=='1')
                {
                    count[1]++;
                }
                if(str.charAt(i)=='2')
                {
                    count[2]++;
                }
                if(str.charAt(i)=='3')
                {
                    count[3]++;
                }
                if(str.charAt(i)=='4')
                {
                    count[4]++;
                }
                if(str.charAt(i)=='5')
                {
                    count[5]++;
                }
                if(str.charAt(i)=='6')
                {
                    count[6]++;
                }
                if(str.charAt(i)=='7')
                {
                    count[7]++;
                }
                if(str.charAt(i)=='8')
                {
                    count[8]++;
                }
                if(str.charAt(i)=='9')
                {
                    count[9]++;
                }
            }

            for(int i=9;i>=0;i--)
            {
                System.out.print(count[i]+" ");
            }
            System.out.println();
        }

    }
}
