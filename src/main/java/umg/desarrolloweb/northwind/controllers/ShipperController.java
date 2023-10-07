package umg.desarrolloweb.northwind.controllers;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umg.desarrolloweb.northwind.commons.CommonController;
import umg.desarrolloweb.northwind.models.Shipper;
import umg.desarrolloweb.northwind.services.ShipperSvc;

@Api
@RestController
@RequestMapping("/shippers")
public class ShipperController extends CommonController<Shipper, ShipperSvc> {
}

