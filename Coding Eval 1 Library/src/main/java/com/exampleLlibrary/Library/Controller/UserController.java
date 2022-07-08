package com.exampleLlibrary.Library.Controller;
import com.exampleLlibrary.Library.Entity.Email;
import com.exampleLlibrary.Library.Entity.User;
import com.exampleLlibrary.Library.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
@RestController
public class UserController
{
    @Autowired
    UserService userService;

    @GetMapping("/GET/users")
    public List<User> getUsers(User user)
    {
       List<User> user1= userService.getUsers(user);
       return  user1;
    }

    @GetMapping("/GET/{id}")
    public Optional<User> getUsingId(@PathVariable Long id)
    {
        return userService.getUser(id);
    }

    @GetMapping("/GET/users/{id}/mail")
    public Optional<Email> getMailForUser(@PathVariable("id") Long id, @RequestBody Email email)
    {
        return userService.getMailForUser(id);
    }


    @PostMapping("/POST/user")
    public String addUser(@RequestBody User user)
    {
        String user1=userService.addUser(user);
        return user1;
    }
    //------------------------------------------------------------------

    @PostMapping("POST/users/{id}/mail")
    public User assignEmail(@PathVariable ("id") Long emailEmail,
                       @RequestBody Email email)
    {
        return userService.assignEmail(emailEmail,email);
    }

//
//    @PostMapping("POST/user/{id}")
//    public User emailPostInUser(@PathVariable ("id") Long userId , @RequestBody Email email)
//    {
//        User user1=userService.emailPostInUser(userId);
//        return user1;
//    }


    @DeleteMapping("DELETE/users/{id}")
    public String deleteUser(@PathVariable ("id") long userId)
    {
        String user1=userService.deleteUser(userId);
        return user1;
    }
}
