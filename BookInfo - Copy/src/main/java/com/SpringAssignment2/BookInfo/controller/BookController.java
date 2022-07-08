package com.SpringAssignment2.BookInfo.controller;
import com.SpringAssignment2.BookInfo.Service.BookService;
import com.SpringAssignment2.BookInfo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
public class BookController
{
  @Autowired
  BookService bookService;

  @GetMapping("/book/ID")
  public List<Book> getAllBooks()
  {
    List<Book> bookInfo = bookService.getAllBooks();
    return bookInfo;
  }

  @PostMapping("/book/add")
  public Book addBook(@RequestBody Book book)
  {
    Book book1= bookService.addBook(book);
    return book1;
  }

  @PutMapping("/book/update")
  public String updateBook(@RequestBody Book book)
  {
    String book1=bookService.updateBook(book);
    return book1;
  }

  @DeleteMapping("/book/{id}")
  public String deleteBook(@PathVariable("id") Integer bookId)
  {
    String msg= bookService.deleteBook(bookId);
    return  msg;
  }

}
