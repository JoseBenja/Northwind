package umg.desarrolloweb.northwind.repositories;

import org.springframework.data.repository.CrudRepository;
import umg.desarrolloweb.northwind.models.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Object> {
}

