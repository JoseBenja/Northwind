package umg.desarrolloweb.northwind.services.impl;

import org.springframework.stereotype.Service;
import umg.desarrolloweb.northwind.commons.CommonSvcImpl;
import umg.desarrolloweb.northwind.models.Employee;
import umg.desarrolloweb.northwind.repositories.EmployeeRepository;
import umg.desarrolloweb.northwind.services.EmployeeSvc;

@Service
public class EmployeeSvcImpl extends CommonSvcImpl<Employee, EmployeeRepository> implements EmployeeSvc {
}

