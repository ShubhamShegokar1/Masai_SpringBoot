package com.Assignment4.BookLibrary.Entity;
import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Book {
    @Id
    int Book_Id;
     String name;
     String author;
     String publication;
     String category;
     int pages;
     int price;
     int registration_no;
     String author_no;

}
