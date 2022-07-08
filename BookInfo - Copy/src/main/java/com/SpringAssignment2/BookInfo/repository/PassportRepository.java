package com.SpringAssignment2.BookInfo.repository;

import com.SpringAssignment2.BookInfo.entity.Book;
import com.SpringAssignment2.BookInfo.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassportRepository extends JpaRepository<Passport,Long>
{

}
