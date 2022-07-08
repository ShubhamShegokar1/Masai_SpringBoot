import java.util.Scanner;

public class Main5
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         int test=Integer.parseInt(sc.nextLine());
         for(int l=0;l<test;l++)
         {
             int count=1;
             String str= sc.nextLine();
             int len=str.length();
             for(int i=0;i<len;i++)
             {
                 if(i>0 && str.charAt(i-1)!=str.charAt(i))
                 {
                     count++;
                 }
             }
             System.out.println(count);
         }

    }
}
