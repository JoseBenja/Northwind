package umg.desarrolloweb.northwind.controllers;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umg.desarrolloweb.northwind.commons.CommonController;
import umg.desarrolloweb.northwind.models.Customer;
import umg.desarrolloweb.northwind.services.CustomerSvc;

@Api
@RestController
@RequestMapping("/customers")
public class CustomerController extends CommonController<Customer, CustomerSvc> {
}

