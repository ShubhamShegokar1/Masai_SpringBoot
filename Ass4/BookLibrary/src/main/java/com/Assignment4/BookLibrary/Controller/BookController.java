package com.Assignment4.BookLibrary.Controller;
import com.Assignment4.BookLibrary.Entity.Book;
import com.Assignment4.BookLibrary.DTO.ReaderDTO;
import com.Assignment4.BookLibrary.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class BookController {
    @Autowired
BookService bookService;

  @GetMapping("/author/bookservice/books")
  public List<Book> getBooks(Book book){
      return (List<Book>) bookService.getBooks(book);
  }
    @GetMapping("/author/bookservice/books/{id}")
    public Book getBook(@PathVariable("id") int bookID){
        return bookService.getBook(bookID);
    }

    @PostMapping("add/bookservice/books")
    public Book addBook(@RequestBody Book book){
      return bookService.addBook(book);
    }

    @DeleteMapping("/delete/bookservice/{id}")
    public String deleteBook(@PathVariable ("id") int bookId){
         return bookService.deleteBook(bookId);
    }

    @PutMapping("/update/bookservice/{id}")
    public String updateBook( @PathVariable ("id")  int bookID, @RequestBody Book book){
        return bookService.updateBook(bookID, book);
    }

    @GetMapping("/reader/bookservice/books/{id}")
    public ReaderDTO readUsingId(@PathVariable("id") int bookID){
        return bookService.readUsingId(bookID);
    }

    @GetMapping("/reader/bookservice/books")
    public List<ReaderDTO> readAll(){
       return bookService.readAll();
    }

}
