package com.example.Spring.Restful.Evaluation.Exception;

public class ProductNotFound extends RuntimeException{
    public ProductNotFound(String msz){
        super(msz);
    }
}
