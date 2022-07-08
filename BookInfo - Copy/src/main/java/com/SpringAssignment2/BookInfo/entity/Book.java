package com.SpringAssignment2.BookInfo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

@Entity
public class Book
{
    @Id
    @GeneratedValue(strategy=AUTO) //Hibernate handles it
    Integer id;
    String BookName;
    Long passportNumber;

    public Book(Integer id, String BookName, Long passportNumber) {
        this.id = id;
        this.BookName=BookName;
        this.passportNumber=passportNumber;
    }

    public Book() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getPassportNumber() {
        return passportNumber;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public void setPassportNumber(Long passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", BookName='" + BookName + '\'' +
                ", passportNumber=" + passportNumber +
                '}';
    }
}
