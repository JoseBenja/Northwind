package umg.desarrolloweb.northwind.repositories;

import org.springframework.data.repository.CrudRepository;
import umg.desarrolloweb.northwind.models.OrderDetail;

public interface OrderDetailRepository extends CrudRepository<OrderDetail, Object> {
}

