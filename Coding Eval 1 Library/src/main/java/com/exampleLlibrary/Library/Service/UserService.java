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
    @Autowired
    EmailRepository emailRepository;


    public List<User> getUsers(User user)
    {
        return userRepository.findAll();
    }

    public Optional<User> getUser(Long id) {
          return userRepository.findById(id);
    }
//----------------------------------------------
    public Optional<Email> getMailForUser(Long id)
    {
          return emailRepository.findById(id);
    }
//-------------------------------------
    public String addUser(User user)
    {
        User user1=userRepository.save(user);
        return "Saved..";
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


//    //-0-0-------------------------------------------------------------------
//    public User emailPostInUser(long userId)
//    {
//        return userRepository.findById(userId).get();
//    }


//-----------------------------------------------------------
    public Email getEmailforUser(long userId,Email email)
    {
        User user= userRepository.findById(userId).get();
        return  email;
    }
//-------------------------------------------------
    public User assignEmail(Long emailEmail, Email email)
    {
        User user= userRepository.findById(emailEmail).get();
        emailRepository.save(email);
        user.setEmail(email);
        userRepository.save(user);
        return  user;
    }



}
