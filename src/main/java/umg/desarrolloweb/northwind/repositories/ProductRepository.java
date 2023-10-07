package umg.desarrolloweb.northwind.repositories;

import org.springframework.data.repository.CrudRepository;
import umg.desarrolloweb.northwind.models.Product;

public interface ProductRepository extends CrudRepository<Product, Object> {
}

