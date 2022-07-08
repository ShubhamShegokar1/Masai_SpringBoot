package com.example.demo.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book
{
    @Id
    Long Id ;
    String name;
    String publication;
    int pages;
    int price;
    String Author ;
     Author author;
}
