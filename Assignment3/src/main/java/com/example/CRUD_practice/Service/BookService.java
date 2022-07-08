package com.example.CRUD_practice.Service;
import com.example.CRUD_practice.Entity.Author;
import com.example.CRUD_practice.Entity.Book;
import com.example.CRUD_practice.Respository.AuthorRepository;
import com.example.CRUD_practice.Respository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService
{
    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    public List<Book> getAuthors(Book book){
        return bookRepository.findAll();
    }


    public Author addBook(int authId,Book book) {
        Author author=authorRepository.findById(authId).get();
        author.addBook(book);
        book.addAuthor(author);
        bookRepository.save(book);
        authorRepository.save(author);
        return  author;
    }
}
