package com.exampleLlibrary.Library.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import static javax.persistence.GenerationType.AUTO;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User
{
    @Id
    @GeneratedValue(strategy=AUTO)
    Long id;
    String name;
    String phoneNo;
    String dateOfBirth;
    @OneToOne
    Email email;
}
