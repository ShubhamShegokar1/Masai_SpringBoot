package com.exampleLlibrary.Library.Controller;

import com.exampleLlibrary.Library.Entity.Email;
import com.exampleLlibrary.Library.Entity.User;
import com.exampleLlibrary.Library.Service.EmailService;
import com.exampleLlibrary.Library.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmailController
{
    @Autowired
    EmailService emailService;
    @Autowired
    UserService userService;

    @PostMapping("/POST/email/{id}")
    public Email addEmail(@PathVariable("id") Long userID ,@RequestBody Email email)
    {
        return emailService.addEmail(userID,email);
    }

    @GetMapping("GET/users/{id}/mail")
    public Email getEmailforUser(@PathVariable ("id") long userId)
    {
        return emailService.getEmailforUser(userId);

    }

}
