package umg.desarrolloweb.northwind.controllers;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umg.desarrolloweb.northwind.commons.CommonController;
import umg.desarrolloweb.northwind.models.Supplier;
import umg.desarrolloweb.northwind.services.SupplierSvc;


@Api
@RestController
@RequestMapping("/suppliers")
public class SupplierController extends CommonController<Supplier, SupplierSvc> {

}
