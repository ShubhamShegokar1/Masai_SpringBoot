package com.SpringAssignment2.BookInfo.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import static javax.persistence.GenerationType.AUTO;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Book
{
    @Id
    @GeneratedValue(strategy=AUTO)
    Integer id;
    String name;
    String author;
    String publication;
    String category;
    String pages;
    String price;
}
