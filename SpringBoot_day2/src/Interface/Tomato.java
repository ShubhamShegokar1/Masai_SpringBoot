package Interface;

public class Tomato implements Fruit , Veggtable
{
    String peel;
    String root;

    public Tomato(String peel, String root) {
        this.peel = peel;
        this.root = root;
    }

    public void hasAPeel()
    {
        System.out.println("Has a peel"+" "+peel);
    }
    @Override
    public void hasARoot()
    {
        System.out.println("Has a root"+" "+root);
    }

    @Override
    public String toString() {
        return "Tomato{" +
                "peel='" + peel + '\'' +
                ", root='" + root + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Tomato t = new Tomato("Yes","No");
        System.out.println(t);
    }
}
