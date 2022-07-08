package com.example.Spring.Restful.Evaluation.Controller;

import com.example.Spring.Restful.Evaluation.DTO.ReaderDTO;
import com.example.Spring.Restful.Evaluation.Entity.Product;
import com.example.Spring.Restful.Evaluation.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/owner/products")
    public List<Product> getProducts () {
        return (List<Product>) productService.getProducts();
    }
    @GetMapping("/owner/product/{id}")
    public Product getProduct(@PathVariable int id){
      return productService.getProduct(id);
    }

    @PostMapping("/owner/product")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @PutMapping("/owner/update/{id}")
    public String updateProduct(@PathVariable int id,@RequestBody Product product){
        return productService.updateProduct(id,product);
    }


    @DeleteMapping("/owner/delproduct/{id}")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }

    @GetMapping("/reader/products")
    public List<ReaderDTO> getProductsForCustomer () {
        return productService.getProductsForCustomer();
    }
    @GetMapping("/reader/product/{id}")
    public ReaderDTO getAllProductsForCustomer(@PathVariable int id){
        return productService.getAllProductsForCustomer(id);
    }
}
