package com.example.CRUD_practice.Controller;
import com.example.CRUD_practice.Entity.Author;
import com.example.CRUD_practice.Entity.Book;
import com.example.CRUD_practice.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController
{

    @Autowired
    BookService bookService;

    @GetMapping("/Book/get")
    public List<Book> getAuthor(Book book)
    {
        List<Book> book1=bookService.getAuthors(book);
        return book1;
    }

    @PostMapping("/book/post/{id}")
    public Author addBook(@PathVariable ("id") Integer authId, @RequestBody Book book) {
        return bookService.addBook(authId,book);
    }



}
