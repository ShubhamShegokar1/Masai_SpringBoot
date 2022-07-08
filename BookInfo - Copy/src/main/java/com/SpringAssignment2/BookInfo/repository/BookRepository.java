package com.SpringAssignment2.BookInfo.repository;
import com.SpringAssignment2.BookInfo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>
{

}
