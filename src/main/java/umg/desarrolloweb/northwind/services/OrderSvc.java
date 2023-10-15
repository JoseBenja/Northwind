package umg.desarrolloweb.northwind.services;

import umg.desarrolloweb.northwind.commons.CommonSvc;
import umg.desarrolloweb.northwind.dtos.NewOrderDto;
import umg.desarrolloweb.northwind.models.Order;
import umg.desarrolloweb.northwind.projections.DataOrderDetailProjection;
import umg.desarrolloweb.northwind.projections.GetOrderDetailsProjection;

import java.util.List;

public interface OrderSvc extends CommonSvc<Order> {

    void saveOrderAndDetail(NewOrderDto newOrderDto);

    List<DataOrderDetailProjection> getOrdersByOrderId(String orderId);

    GetOrderDetailsProjection getOrderDetailsByOrderId(long orderDetailId);

    void deleteOrderDetailByOrderId(long orderId, long orderDetailId);
}