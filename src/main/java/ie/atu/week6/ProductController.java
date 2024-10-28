package ie.atu.week6;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private List<Product> list = new ArrayList<>();

    @GetMapping
    public List<Product> getProducts() {
        return list;
    }

    @PostMapping
    public List<Product> newProduct(@RequestBody Product product) {
        list.add(product);
        return list;
    }

}
