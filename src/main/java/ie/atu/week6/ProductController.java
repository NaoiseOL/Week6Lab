package ie.atu.week6;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ServiceController myService;

    public ProductController(ServiceController myservice) {
        this.myService = myservice;
    }

    private List<Product> list = new ArrayList<>();

    @GetMapping
    public List<Product> getProducts() {
        list = myService.getProducts();
        return list;
    }

    @PostMapping
    public List<Product> newProduct(@RequestBody Product product) {
        list = myService.addProduct(product);
        return list;
    }

}
