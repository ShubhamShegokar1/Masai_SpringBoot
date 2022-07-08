package com.example.CRUD_practice.Service;
import com.example.CRUD_practice.Entity.Professor;
import com.example.CRUD_practice.Respository.ProfessorRepository;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Service
public class ProfessorService
{
 @Autowired
 ProfessorRepository professorRepository;

 public Professor findById(Integer professorId){
  return professorRepository.findById(professorId).get();
 }


 public List<Professor> getProfessors(Professor professor) {
  return professorRepository.findAll();
 }

 public String removeProfessor(int professorId) {
   Professor toBeDeleted= professorRepository.findById(professorId).get();
  try {
   professorRepository.delete(toBeDeleted);
   return "Deletion Success";
  }
  catch (Exception e) {
   return "Deletion failed";
  }
 }

 public String addProfessor(Professor professor) {
  professorRepository.save(professor);
 return "";
 }
}
