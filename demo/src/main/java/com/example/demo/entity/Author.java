package com.example.demo.entity;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Author
{
    @Id
    Long Id;
    String name ;
    int age ;
    String publication;
    String address ;
   //  List<Book> book;
}
