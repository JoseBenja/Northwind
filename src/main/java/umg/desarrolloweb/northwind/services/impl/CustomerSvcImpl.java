package umg.desarrolloweb.northwind.services.impl;

import org.springframework.stereotype.Service;
import umg.desarrolloweb.northwind.commons.CommonSvcImpl;
import umg.desarrolloweb.northwind.models.Customer;
import umg.desarrolloweb.northwind.repositories.CustomerRepository;
import umg.desarrolloweb.northwind.services.CustomerSvc;

@Service
public class CustomerSvcImpl extends CommonSvcImpl<Customer, CustomerRepository> implements CustomerSvc {
}

