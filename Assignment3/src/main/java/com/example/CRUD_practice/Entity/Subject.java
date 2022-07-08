package com.example.CRUD_practice.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Subject
{
    @Id
    int subjectId;
     String name;
     String timings;
     String duration;
     int roomNo;
     @JsonIgnore
     @ManyToMany(mappedBy = "subjects" , cascade = CascadeType.ALL)
     List<Professor> professors= new ArrayList<>();
    public void addSubject(Professor professor) {
    this.professors.add(professor);
   }
    public void removeSubject(Professor professor) {
        this.professors.remove(professor);
    }
}
