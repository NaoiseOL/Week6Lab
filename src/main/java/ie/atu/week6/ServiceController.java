package ie.atu.week6;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

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
}
