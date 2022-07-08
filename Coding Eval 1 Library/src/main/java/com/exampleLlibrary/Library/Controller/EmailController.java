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
    UserService userService;

    @PostMapping("/POST/email")
    public String addEmail(@RequestBody Email email)
    {
        String emailMsz=emailService.addEmail(email);
        return emailMsz;
    }

    @GetMapping("GET /users/{id}/mail")
    public Email getEmailforUser(@PathVariable("id") long userId,@RequestBody Email email)
    {
        Email user1=userService.getEmailforUser(userId,email);
        return user1;
    }

}
