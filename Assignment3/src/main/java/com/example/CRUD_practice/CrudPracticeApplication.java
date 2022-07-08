package com.example.CRUD_practice;

import com.example.CRUD_practice.Entity.Professor;
import com.example.CRUD_practice.Service.AuthorService;
import com.example.CRUD_practice.Service.BookService;
import com.example.CRUD_practice.Service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudPracticeApplication implements CommandLineRunner{
	@Autowired
	AuthorService authorService;
	@Autowired
	BookService bookService;

	@Autowired
	ProfessorService professorService;
	public static void main(String[] args) {
		SpringApplication.run(CrudPracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Professor professor= professorService.findById(101);
	}
}
