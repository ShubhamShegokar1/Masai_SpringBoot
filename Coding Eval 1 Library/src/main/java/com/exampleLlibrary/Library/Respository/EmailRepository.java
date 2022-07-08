package com.exampleLlibrary.Library.Respository;

import com.exampleLlibrary.Library.Entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository <Email,Long>{
}
