package Sorting;
abstract class SortingAlgorithm
{
    int arr[];
     abstract int selection(int n);
     abstract int bubble();
     abstract int insertion();

    public static void main(String[] args)
    {
       SortingAlgorithm s=new Selection();
        System.out.println(s.selection(3));
    }
}
