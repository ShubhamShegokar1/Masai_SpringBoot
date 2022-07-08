package com.example.CRUD_practice.Respository;

import com.example.CRUD_practice.Entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Integer > {
}
