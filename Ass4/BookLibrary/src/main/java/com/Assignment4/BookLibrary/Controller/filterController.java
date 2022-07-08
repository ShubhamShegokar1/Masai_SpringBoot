package com.Assignment4.BookLibrary.Controller;

import com.Assignment4.BookLibrary.Entity.Book;
import com.Assignment4.BookLibrary.Service.BookService;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public class filterController {


    @Autowired
    BookService bookService;
//    @GetMapping("/reader/bookservice/books")
//    public MappingJacksonValue getBook(Book book) {
//         List<Book> book1= bookService.getBooks(book);
//        SimpleBeanPropertyFilter filter= SimpleBeanPropertyFilter.filterOutAllExcept("Book_Id","name","author","publication","category","pages","price");
//        FilterProvider filters= new SimpleFilterProvider().addFilter("BookFilter",filter);
//        MappingJacksonValue mapping=new MappingJacksonValue(book1);
//        mapping.setFilters(filters);
//        return mapping;
//    }
//
//    @GetMapping("/reader/bookservice/books/{id}")
//    public MappingJacksonValue getABook(@PathVariable("id") int bookId) {
//        Book book =bookService.getBook(bookId);
//        SimpleBeanPropertyFilter filter= SimpleBeanPropertyFilter.filterOutAllExcept("Book_Id","name","author","publication","category","pages","price");
//        FilterProvider  filters= new SimpleFilterProvider().addFilter("BookFilter",filter);
//        MappingJacksonValue mapping=new MappingJacksonValue(book);
//        mapping.setFilters(filters);
//        return mapping;
//    }

}
