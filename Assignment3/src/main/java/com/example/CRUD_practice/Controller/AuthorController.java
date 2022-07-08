package com.example.CRUD_practice.Controller;
import com.example.CRUD_practice.Entity.Author;
import com.example.CRUD_practice.Entity.Book;
import com.example.CRUD_practice.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
public class AuthorController
{
    @Autowired
    AuthorService authorService;

    @GetMapping("/author/get")
     public List<Author> getAuthor(Author author) {
     List<Author> author1=authorService.getAuthors(author);
     return author1;
  }

  @PostMapping("/author/post")
   public String addAuthor(@RequestBody Author author) {
      String author1=authorService.addAuthor(author);
      return author1;
   }
//---------------------------------------------------------------------
//   @PostMapping("/assign/book/{id}")
//   public Book assignBook(@PathVariable("id") int authId,
//                       @RequestBody Book book){
//    return  authorService.assignBook(authId,book);
//   }
//-------------------------------------------------------------
   @PutMapping("/author/put")
    public String updateAuthor(@RequestBody Author author) {
      String author1= authorService.updateAuthor(author);
      return author1;
   }

   @DeleteMapping("/author/delete/{id}")
   public String deleteAuthor(@PathVariable ("id") int authorId) {
     String msz=authorService.deleteAuthor(authorId);
     return msz;
   }

}
