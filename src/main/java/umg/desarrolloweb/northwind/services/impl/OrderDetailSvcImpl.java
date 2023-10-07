package umg.desarrolloweb.northwind.services.impl;

import org.springframework.stereotype.Service;
import umg.desarrolloweb.northwind.commons.CommonSvcImpl;
import umg.desarrolloweb.northwind.models.OrderDetail;
import umg.desarrolloweb.northwind.repositories.OrderDetailRepository;
import umg.desarrolloweb.northwind.services.OrderDetailSvc;

@Service
public class OrderDetailSvcImpl extends CommonSvcImpl<OrderDetail, OrderDetailRepository> implements OrderDetailSvc {
}

