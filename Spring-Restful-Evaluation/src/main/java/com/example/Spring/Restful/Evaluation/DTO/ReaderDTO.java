package com.example.Spring.Restful.Evaluation.DTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ReaderDTO {
    @Id
    int id;
    String name;
    int price;
    String brand;
    String category;
}
