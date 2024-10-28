package ie.atu.week6;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceController {
    private List<Product> myList = new ArrayList<>();

    @GetMapping
    public List<Product> getProducts() {
        return myList;
    }

    @PostMapping
    public List<Product> addProduct(Product product) {
        myList.add(product);
        return myList;
    }

    @PutMapping
    public List<Product> updateProduct(String id, Product product) {
        for(Product p : myList){
            if(p.getId().equals(id)){
                myList.remove(p);
            }
        }
        myList.add(product);
        return myList;
    }

    @DeleteMapping
    public List<Product> deleteProduct(String id) {
        for(Product p : myList){
            if(p.getId().equals(id)){
                myList.remove(p);
            }
        }
        return myList;
    }
}
