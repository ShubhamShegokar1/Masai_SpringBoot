package com.exampleLlibrary.Library.Service;

import com.exampleLlibrary.Library.Entity.Email;
import com.exampleLlibrary.Library.Entity.User;
import com.exampleLlibrary.Library.Respository.EmailRepository;
import com.exampleLlibrary.Library.Respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService
{
    @Autowired
    UserRepository userRepository;
    EmailRepository emailRepository;


    public List<User> getUser(User user)
    {
        return userRepository.findAll();
    }

    public String addUser(User user)
    {
        User user1=userRepository.save(user);
        return "Saved..";
    }

    public String updateUser(User user) {
       Optional< User> user1= userRepository.findById(user.getId());
       if(user1.isEmpty())
       {
           return "Empty id";
       }
       return "Upadted..";
    }


    public String deleteUser(long userId)
    {
        User user= userRepository.findById(userId).get();
        try
        {
            userRepository.delete(user);
            return "Deletion Success";
        }
        catch (Exception e)
        {
            return "Deletion failed";
        }
    }
    public User getUsingID(long userId) {
        return userRepository.findById(userId).get();
    }


    public Email assignEmail(Long emailEmail, Email email)
    {
        User user= userRepository.findById(emailEmail).get();
        emailRepository.save(email);
        user.setEmail(email);
        userRepository.save(user);
        return  email;
    }



}
