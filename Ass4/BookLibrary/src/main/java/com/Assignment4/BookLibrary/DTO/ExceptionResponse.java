package com.Assignment4.BookLibrary.DTO;
import lombok.*;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class ExceptionResponse  {
    Date timeStamp;
    String message;
    String details;
}
