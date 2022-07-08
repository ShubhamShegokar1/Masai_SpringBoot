package Review;

public class bookRunner
{
    public static void main(String[] args)
    {
        Book book = new Book(1,"Devendra Swast","Happy Me ");
        Book book1 = new Book(2,"Shubham ","Happy family ");
        Book book2 = new Book(3,"Jai Ram Ji ","Life ");

        Review review= new Review(101, "Noise",4.5F);
        Review review1= new Review(102, "Nice Book",2.5F);
        Review review2= new Review(103, " Book",3.5F);
        Review review3= new Review(104, "ok ok",5.1F);
        Review review4= new Review(105, " Vey Nice",4.5F);

        book.addReviews(review);
        book.addReviews(review3);
        book1.addReviews(review1);
        book1.addReviews(review2);
        book2.addReviews(review4);
        System.out.println(book);
        System.out.println(book1);
        System.out.println(book2);
    }
}
