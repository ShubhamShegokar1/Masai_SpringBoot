package com.example.Spring.Restful.Evaluation.Repository;

import com.example.Spring.Restful.Evaluation.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
