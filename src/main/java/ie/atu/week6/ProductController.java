package ie.atu.week6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @Autowired
    private ServiceController serviceController;

    @PutMapping("/{id}")
    public ResponseEntity<List<Product>> updateProduct(@PathVariable String id, @RequestBody Product product) {
        List<Product> updatedList = serviceController.updateProduct(id, product);
        return ResponseEntity.ok(updatedList);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<List<Product>> deleteProduct(@PathVariable String id) {
        List<Product> updatedList = serviceController.deleteProduct(id);
        return ResponseEntity.ok(updatedList);
    }


}
