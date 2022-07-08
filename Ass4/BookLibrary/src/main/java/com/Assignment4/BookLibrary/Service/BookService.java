package com.Assignment4.BookLibrary.Service;
import com.Assignment4.BookLibrary.Entity.Book;
import com.Assignment4.BookLibrary.DTO.ReaderDTO;
import com.Assignment4.BookLibrary.Exception.UserNotFound;
import com.Assignment4.BookLibrary.Repository.BookRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class BookService {

@Autowired
    BookRepository bookRepository;
    public List<Book> getBooks(Book book) {
        Optional <List<Book>> book1= Optional.of(bookRepository.findAll());
        if(book1.isEmpty())
            throw new UserNotFound("Empty Data");
        return book1.get();
    }
    public String deleteBook(int bookId) {
        Book book1 = (bookRepository.findById(bookId).get());
        if(book1==null) {
            throw new UserNotFound("User Not found");
        }
        bookRepository.delete(book1);
        return "Deleted Successfully";
    }

    public Book getBook(int bookID) {
        Optional<Book> book1= bookRepository.findById(bookID);
        if(book1.isEmpty()) throw new UserNotFound("InvalidId");
        return book1.get();
    }

    public Book addBook(Book book) {
       Book book1= bookRepository.save(book);
       return book1;
    }

    public String updateBook(int bookId,Book book) {
       if(bookRepository.findById(bookId).isPresent()){
           Book book1=bookRepository.findById(bookId).get();
            bookRepository.save(book);
           return "Updated Successfully";
       }
        else {
           throw new UserNotFound("User Not found");
       }
    }

    public ReaderDTO readUsingId(int bookID) {
      Book book =bookRepository.findById(bookID).get();
      ReaderDTO readerDto = new ReaderDTO();
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.map(book,readerDto);
      return readerDto;
    }

    public List<ReaderDTO> readAll() {
        List<Book> book =bookRepository.findAll();
        ModelMapper modelMapper = new ModelMapper();
        List <ReaderDTO> ls = modelMapper.map(book,new TypeToken<List <ReaderDTO>>() {}.getType());
        return ls;
    }
}
