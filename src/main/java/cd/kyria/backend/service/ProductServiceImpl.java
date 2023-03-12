package cd.kyria.backend.service;

import cd.kyria.backend.model.Product;
import cd.kyria.backend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getById(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public Product update(Long id, Product product) {
        Product existingProduct = getById(id);
        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setStatus(product.getStatus());
        return productRepository.save(existingProduct);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
