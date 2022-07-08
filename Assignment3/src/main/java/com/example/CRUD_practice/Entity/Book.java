package com.example.CRUD_practice.Entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Book
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int  bookId;
    String name;
    String publication;
    String category;
    int pages;
    int price;
    @JsonIgnore
    @ManyToOne
    Author author;
    public void addAuthor(Author author){
        this.author=author;
    }

}
