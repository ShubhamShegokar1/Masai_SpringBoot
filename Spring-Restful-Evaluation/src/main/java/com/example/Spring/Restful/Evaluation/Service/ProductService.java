package com.example.Spring.Restful.Evaluation.Service;
import com.example.Spring.Restful.Evaluation.DTO.ReaderDTO;
import com.example.Spring.Restful.Evaluation.Entity.Product;
import com.example.Spring.Restful.Evaluation.Exception.NullValueError;
import com.example.Spring.Restful.Evaluation.Exception.ProductNotFound;
import com.example.Spring.Restful.Evaluation.Repository.ProductRepository;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public List<Product> getProducts() {
        Optional<List<Product>> product1= Optional.of(productRepository.findAll());
        if(product1.isEmpty())
            throw new ProductNotFound("Products Not Found");
        return product1.get();
    }
    public Product getProduct(int id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isEmpty()) {
            throw new ProductNotFound("Product Not Found");
        }
        return product.get();
    }
    public Product addProduct(Product product) {
        if(product==null)
            throw new NullValueError("Null Value Error");
        else
         productRepository.save(product);
       return  product;
    }

    public String deleteProduct(int id) {
        if(productRepository.findById(id).isPresent()){
            Product product1=productRepository.findById(id).get();
            productRepository.delete(product1);
            return "Success";
        }
        else
            throw new ProductNotFound("Id is wrong or data unavailable");
    }
    public String updateProduct(int id, Product product) {
        if(productRepository.findById(id).isPresent()){
            Product product1=productRepository.findById(id).get();
            productRepository.save(product);
            return "Updated";
        }
        else
            throw new ProductNotFound("Failed to update");
    }


    public List<ReaderDTO> getProductsForCustomer() {
       List<Product> product1= productRepository.findAll();
            ModelMapper modelMapper = new ModelMapper();
            List<ReaderDTO> readerDTOS = modelMapper.map(product1, new TypeToken<List<ReaderDTO>>() {
            }.getType());

        return readerDTOS;
    }

    public ReaderDTO getAllProductsForCustomer(int id) {
         Product product1 = productRepository.findById(id).get();
        ReaderDTO readerDTO= new ReaderDTO();
        ModelMapper modelMapper= new ModelMapper();
        modelMapper.map(product1,readerDTO);
        return readerDTO;
    }
}
