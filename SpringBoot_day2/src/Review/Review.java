package Review;

public class Review
{
 int id;
 String description;
 float rating;

 public Review(int id, String description, float rating) {
  this.id = id;
  this.description = description;
  this.rating = rating;
 }

 @Override
 public String toString() {
  return "Review{" +
          "id=" + id +
          ", description='" + description + '\'' +
          ", rating=" + rating +
          '}';
 }
}