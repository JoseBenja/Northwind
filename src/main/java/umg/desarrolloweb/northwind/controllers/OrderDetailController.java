package umg.desarrolloweb.northwind.controllers;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umg.desarrolloweb.northwind.commons.CommonController;
import umg.desarrolloweb.northwind.models.OrderDetail;
import umg.desarrolloweb.northwind.services.OrderDetailSvc;

@Api
@RestController
@RequestMapping("/orderdetails")
public class OrderDetailController extends CommonController<OrderDetail, OrderDetailSvc> {
}

