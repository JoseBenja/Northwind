package umg.desarrolloweb.northwind.controllers;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umg.desarrolloweb.northwind.commons.CommonController;
import umg.desarrolloweb.northwind.models.Order;
import umg.desarrolloweb.northwind.services.OrderSvc;

@Api
@RestController
@RequestMapping("/orders")
public class OrderController extends CommonController<Order, OrderSvc> {
}

