package com.Assignment4.BookLibrary.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_MODIFIED)

public class OperationFailed extends RuntimeException{
    public OperationFailed(String str){
        super(str);
    }
}
