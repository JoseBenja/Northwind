package umg.desarrolloweb.northwind.repositories;

import org.springframework.data.repository.CrudRepository;
import umg.desarrolloweb.northwind.models.Order;

public interface OrderRepository extends CrudRepository<Order, Object> {
}

