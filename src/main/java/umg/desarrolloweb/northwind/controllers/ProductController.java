package umg.desarrolloweb.northwind.controllers;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umg.desarrolloweb.northwind.commons.CommonController;
import umg.desarrolloweb.northwind.models.Product;
import umg.desarrolloweb.northwind.services.ProductSvc;

@Api
@RestController
@RequestMapping("/products")
public class ProductController extends CommonController<Product, ProductSvc> {

}

