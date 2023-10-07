package umg.desarrolloweb.northwind.repositories;

import org.springframework.data.repository.CrudRepository;
import umg.desarrolloweb.northwind.models.Supplier;

public interface SupplierRepository extends CrudRepository<Supplier, Object> {
}
