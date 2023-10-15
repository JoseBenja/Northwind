package umg.desarrolloweb.northwind.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import umg.desarrolloweb.northwind.models.Supplier;

import java.util.List;

public interface SupplierRepository extends CrudRepository<Supplier, Object> {

}
