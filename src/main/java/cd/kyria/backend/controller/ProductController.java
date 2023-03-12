package cd.kyria.backend.controller;

import cd.kyria.backend.model.Product;
import cd.kyria.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@CrossOrigin("http://localhost:3000")
public class ProductController {
    
    @Autowired
    private ProductService productService;
    
    @GetMapping()
    public List<Product> getAll(){
        return productService.getAll();
    }
    
    @PostMapping()
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }
    
    @GetMapping("/{id}")
    public Product getById(@PathVariable ("id") Long id){
       return productService.getById(id);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable ("id") Long id, @RequestBody Product product){
        return productService.update(id, product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable ("id") Long id){
        productService.delete(id);
    }
    
}
