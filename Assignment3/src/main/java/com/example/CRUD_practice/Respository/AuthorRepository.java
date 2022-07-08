package com.example.CRUD_practice.Respository;

import com.example.CRUD_practice.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer>
{
}
