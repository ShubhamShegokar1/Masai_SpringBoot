package com.exampleLlibrary.Library.Controller;

import com.exampleLlibrary.Library.Entity.Email;
import com.exampleLlibrary.Library.Entity.User;
import com.exampleLlibrary.Library.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController
{
    @Autowired
    UserService userService;

    @GetMapping("/GET/users")
    public List<User> getUser(User user)
    {
       List<User> user1= userService.getUser(user);
       return  user1;
    }

    @PostMapping("/POST/user")
    public String addUser(@RequestBody User user)
    {
        String user1=userService.addUser(user);
        return user1;
    }
    //------------------------------------------------------------------

    @PostMapping("Post/users/{id}/mail")
    public Email assignEmail(@PathVariable ("id") Long emailEmail,
                       @RequestBody Email email)
    {
        return userService.assignEmail(emailEmail,email);
    }

//---------------------------------------------------------------------
    @PutMapping("PUT/user")
    public String updateUser(@RequestBody User user)
    {
        String user1=userService.updateUser(user);
        return user1;
    }

    @DeleteMapping("DELETE/users/{id}")
    public String deleteUser(@PathVariable ("id") long userId)
    {
        String user1=userService.deleteUser(userId);
        return user1;
    }

    @GetMapping("user/{id}")
    public User getUsingID(@PathVariable ("id") long userId)
    {
        return userService.getUsingID(userId);
    }





}
