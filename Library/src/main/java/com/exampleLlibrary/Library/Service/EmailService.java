package com.exampleLlibrary.Library.Service;
import com.exampleLlibrary.Library.Entity.Email;
import com.exampleLlibrary.Library.Entity.User;
import com.exampleLlibrary.Library.Respository.EmailRepository;
import com.exampleLlibrary.Library.Respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
@Service
public class EmailService {

    @Autowired
    EmailRepository emailRepository;

    @Autowired
    UserRepository userRepository;

    public Email addEmail(long userID,Email email) {
        User user=userRepository.findById(userID).get();
        user.setEmail(email);
        email.setUser(user);
        emailRepository.save(email);
        userRepository.save(user);
        return email;
    }

    public Email getEmailforUser(long userId) {
        User user = userRepository.findById(userId).get();
        return user.getEmail();
    }


}
