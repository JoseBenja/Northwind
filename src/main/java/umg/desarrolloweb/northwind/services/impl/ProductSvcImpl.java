package umg.desarrolloweb.northwind.services.impl;

import org.springframework.stereotype.Service;
import umg.desarrolloweb.northwind.commons.CommonSvcImpl;
import umg.desarrolloweb.northwind.models.Product;
import umg.desarrolloweb.northwind.repositories.ProductRepository;
import umg.desarrolloweb.northwind.services.ProductSvc;

@Service
public class ProductSvcImpl extends CommonSvcImpl<Product, ProductRepository> implements ProductSvc {

}

