package com.example.CRUD_practice.Controller;
import com.example.CRUD_practice.Entity.Professor;
import com.example.CRUD_practice.Service.ProfessorService;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfessorController {
    @Autowired
    ProfessorService professorService;


    @GetMapping("/professor/get")
    public List<Professor> getProfessor(Professor professor) {
        List<Professor> professors=professorService.getProfessors(professor);
        return professors;
    }

    @GetMapping("/professor/{id}")
    public Professor findById(@PathVariable ("id") int professorId){
         Professor professor=professorService.findById(professorId);
         return professor;
    }

    @DeleteMapping("/Pofessordelete/{id}")
    public String removeProfessor(@PathVariable ("id") int professorId){
         String str=professorService.removeProfessor(professorId);
         return str;
    }

    @PostMapping("/ProfessorAdd")
    public String addProfessor(@RequestBody Professor professor){
        String str=professorService.addProfessor(professor);
        return str;
    }

}
