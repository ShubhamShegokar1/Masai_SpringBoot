import java.text.DecimalFormat;
import java.util.Scanner;

public class Main2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double n=sc.nextInt();
        double counter=0;
        double ans=0;
        double r=sc.nextInt();
        find(n,r,counter,ans);
    }
    private static double find(double n, double r, double counter,double ans)
    {
        if(counter>n)
        {
            DecimalFormat d = new DecimalFormat("#.####");
            System.out.println(Double.valueOf(d.format(ans)));
            return ans;
        }
        ans+=(1/Math.pow(r,counter));
        return find(n, r, counter+1, ans);
    }
}
