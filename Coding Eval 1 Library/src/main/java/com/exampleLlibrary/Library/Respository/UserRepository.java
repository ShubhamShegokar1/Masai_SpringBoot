package com.exampleLlibrary.Library.Respository;

import com.exampleLlibrary.Library.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User,Long> {
}
