package com.example.CRUD_practice.Service;
import com.example.CRUD_practice.Entity.Author;
import com.example.CRUD_practice.Entity.Book;
import com.example.CRUD_practice.Respository.AuthorRepository;
import com.example.CRUD_practice.Respository.BookRepository;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service

public class AuthorService
{
    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    BookRepository bookRepository;

    public Author findById(Integer id){
        Author author = authorRepository.findById(id).get();
        return author;
    }

    public void addReviews(Integer id, List<Book> books) {
        Author course = authorRepository.findById(id).get();
        for(Book book : books){
            course.addBook((book));
            book.setAuthor(course);
            //authorRepository.save(book);
        }

    }



    public List<Author> getAuthors(Author author) {
        List<Author> author1=authorRepository.findAll();
        return author1;
    }

    public String addAuthor(Author author) {
        authorRepository.save(author);
        return "Saved..";
    }

    public String updateAuthor(Author author)
    {
       Optional<Author> author1=authorRepository.findById(author.getId());
       if(author1.isEmpty()) {
           return "Empty..";
       }

       return "Updated";
    }

    public String deleteAuthor(int authorId) {
        Author author= authorRepository.findById(authorId).get();
        try {
            authorRepository.delete(author);
            return "Deletion Success";
        }
        catch (Exception e) {
            return "Deletion failed";
        }
    }

//--------------------------------------------------------------
//    @Transactional
//    public Book assignBook(int authId,Book book) {
//        Author author=authorRepository.findById(authId).get();
//        bookRepository.save(book);
//        author.addBook(book);
//        authorRepository.save(author);
//        return  book;
//    }
//----------------------------------------------------------------------
}
