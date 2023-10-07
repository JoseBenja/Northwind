package umg.desarrolloweb.northwind.repositories;

import org.springframework.data.repository.CrudRepository;
import umg.desarrolloweb.northwind.models.Category;

public interface CategoryRepository extends CrudRepository<Category, Object> {
}
