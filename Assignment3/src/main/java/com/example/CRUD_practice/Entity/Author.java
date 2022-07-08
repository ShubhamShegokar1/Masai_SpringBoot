package com.example.CRUD_practice.Entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import static javax.persistence.GenerationType.AUTO;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Author
{

    @Id
    @GeneratedValue(strategy=AUTO)
    int id;
    String name;
    Long age;
    String address;
    //@JsonIgnore
    @OneToMany(mappedBy = "author")
    private List<Book> booklist= new ArrayList<>();

    public void addBook(Book book){
        this.booklist.add(book);
      }

    public void removeBook(Book book) {
        this.booklist.remove(book);
    }

}














