package com.Assignment4.BookLibrary.Exception;

public class UserNotFound extends RuntimeException{
    public UserNotFound (String msz){
        super(msz);
    }
}

