import java.util.ArrayList;
import java.util.Scanner;

public class Main1
{
    public static void main(String[] args)
    {
        ArrayList <Integer> position = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count[]= new int[150];
        int j=0;
        for(int i=0;i<str.length();i++)
        {
            int ascii=str.charAt(i);
            count[ascii]++;
            if(count[ascii]==1) {
                position.add(ascii);
                j++;
            }
        }

        int k=0;
        while(k<position.size())
        {
            int ascii= position.get(k);
            if(ascii!=32) {
                char temp = (char) ascii;
                System.out.print(temp);
            }
            k++;
        }
    }
}
