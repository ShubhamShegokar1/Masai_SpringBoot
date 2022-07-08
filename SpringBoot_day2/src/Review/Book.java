package Review;

import java.util.ArrayList;

public class Book<Private>
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    private int id;
    private String author;
    private  ArrayList<Review> reviews=new ArrayList<Review>();

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void addReviews(Review review) {
        this.reviews.add(review);
    }

    public Book(int id,String name, String author)
    {
        this.id=id;
        this.name=name;
        this.author=author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", author='" + author + '\'' +
                ", reviews=" + reviews +
                '}';
    }
}
