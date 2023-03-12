package cd.kyria.backend.service;

import cd.kyria.backend.model.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getAll();

    public Product save(Product product);

    public Product getById(Long id);

    public Product update(Long id, Product product);

    public void delete(Long id);

}
