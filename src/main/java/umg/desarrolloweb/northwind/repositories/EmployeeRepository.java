package umg.desarrolloweb.northwind.repositories;

import org.springframework.data.repository.CrudRepository;
import umg.desarrolloweb.northwind.models.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Object> {
}

