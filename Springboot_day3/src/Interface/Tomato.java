package Interface;

public class Tomato implements Fruit , Veggtable
{
    public void hasAPeel()
    {
        System.out.println("hasAPeel");
    }

    @Override
    public void hasARoot()
    {
        System.out.println("hasARoot");
    }

    public static void main(String[] args) {
        Tomato t = new Tomato();
        System.out.println();
    }
}
