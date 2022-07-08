package com.Assignment4.BookLibrary.DTO;
import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ReaderDTO {
    int Book_Id;
    String name;
    String author;
    String publication;
    String category;
    int pages;
    int price;

}
