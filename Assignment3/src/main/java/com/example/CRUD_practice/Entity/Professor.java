package com.example.CRUD_practice.Entity;
import lombok.*;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Professor
{
    @Id
    int professorId;
    String name;
    int age;
    String address;
    @ManyToMany
    @JoinTable(name="PROFESSOR_SUBJECT" ,
    joinColumns = @JoinColumn(name="PROFESSORID"),
    inverseJoinColumns = @JoinColumn(name="COURSEID"))
    List<Subject> subjects= new ArrayList<>();

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }

    public void removeSubject(Subject subject) {
        this.subjects.remove(subject);
    }
}
