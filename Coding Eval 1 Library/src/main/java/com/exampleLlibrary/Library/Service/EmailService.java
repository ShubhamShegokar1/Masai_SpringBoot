package com.exampleLlibrary.Library.Service;

import com.exampleLlibrary.Library.Entity.Email;
import com.exampleLlibrary.Library.Respository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmailService {

    @Autowired
    EmailRepository emailRepository;

    public String addEmail(Email email)
    {
        Email user1=emailRepository.save(email);
        return "Saved..";
    }


}
