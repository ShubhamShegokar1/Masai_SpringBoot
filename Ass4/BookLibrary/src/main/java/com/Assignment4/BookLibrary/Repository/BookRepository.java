package com.Assignment4.BookLibrary.Repository;

import com.Assignment4.BookLibrary.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BookRepository extends JpaRepository<Book,Integer> {
}
