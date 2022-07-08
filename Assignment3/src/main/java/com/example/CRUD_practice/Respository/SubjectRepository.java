package com.example.CRUD_practice.Respository;

import com.example.CRUD_practice.Entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject,Integer> {
}
