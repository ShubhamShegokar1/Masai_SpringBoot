package com.SpringAssignment2.BookInfo.Service;
import com.SpringAssignment2.BookInfo.entity.Book;
import com.SpringAssignment2.BookInfo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;
import java.util.Optional;


@Service
public class BookService
{

 @Autowired
 BookRepository bookRepository;

 public List<Book> getAllBooks()
 {
  List<Book> bookInfo =bookRepository.findAll();
  return  bookInfo;
 }

 public Book addBook(Book book)
 {
   Book book1=bookRepository.save(book);
   return book1;
 }

 public String updateBook(Book book)
 {
  Optional <Book> book1= bookRepository.findById(book.getId());
  if(book1.isEmpty()) {
   return "Repository Error";
  }
  //updated
  book1.get().setPassportNumber(book.getPassportNumber());
  bookRepository.save(book1.get());
  return "Info Updated";
 }


 public String deleteBook(Integer bookId)
 {
  Book bk= bookRepository.findById(bookId).get();
  try
  {
   bookRepository.delete(bk);
   return "Deletion Success";
  }
  catch (Exception e)
  {
   return "Deletion failed";
  }
 }

}
