package umg.desarrolloweb.northwind.controllers;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umg.desarrolloweb.northwind.commons.CommonController;
import umg.desarrolloweb.northwind.models.Employee;
import umg.desarrolloweb.northwind.services.EmployeeSvc;

@Api
@RestController
@RequestMapping("/employees")
public class EmployeeController extends CommonController<Employee, EmployeeSvc> {
}

