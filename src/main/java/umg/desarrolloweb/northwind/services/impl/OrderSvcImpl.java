package umg.desarrolloweb.northwind.services.impl;

import org.springframework.stereotype.Service;
import umg.desarrolloweb.northwind.commons.CommonSvcImpl;
import umg.desarrolloweb.northwind.models.Order;
import umg.desarrolloweb.northwind.repositories.OrderRepository;
import umg.desarrolloweb.northwind.services.OrderSvc;

@Service
public class OrderSvcImpl extends CommonSvcImpl<Order, OrderRepository> implements OrderSvc {
}

