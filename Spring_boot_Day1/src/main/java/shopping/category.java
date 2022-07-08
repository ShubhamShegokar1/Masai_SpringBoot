package shopping;
import Items.purchaseItems;
class clothes
{
  private String wears="luis";
}

class shoes
{
    public static String wears="paragon";
    public shoes(String w)
    {
        this.wears=w;
    }

   public static void run()
   {
       System.out.println(wears);
   }
}

public class category
{
   public static void main(String[] args)
   {
       category a= new category();
       shoes s= new shoes("shubhamm");
       purchaseItems b = new purchaseItems();
       System.out.println();
   }
}
