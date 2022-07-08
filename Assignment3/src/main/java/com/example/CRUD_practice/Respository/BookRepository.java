package com.example.CRUD_practice.Respository;

import com.example.CRUD_practice.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
