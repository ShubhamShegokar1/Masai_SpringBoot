package com.exampleLlibrary.Library.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Email
{
    @Id
    @GeneratedValue(strategy=AUTO)
    long mailId;
    String mail;
    String createdDate;
    @JsonIgnore
    @OneToOne (mappedBy = "email")
    User user;
}
