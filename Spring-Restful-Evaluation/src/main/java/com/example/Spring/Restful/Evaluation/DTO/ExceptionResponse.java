package com.example.Spring.Restful.Evaluation.DTO;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ExceptionResponse {
    Date timeStamp;
    String message;
    String Details;
}
