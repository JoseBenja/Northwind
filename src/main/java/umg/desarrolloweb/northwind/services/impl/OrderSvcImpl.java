package umg.desarrolloweb.northwind.services.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.desarrolloweb.northwind.commons.CommonSvcImpl;
import umg.desarrolloweb.northwind.dtos.NewOrderDto;
import umg.desarrolloweb.northwind.models.Order;
import umg.desarrolloweb.northwind.models.OrderDetail;
import umg.desarrolloweb.northwind.projections.DataOrderDetailProjection;
import umg.desarrolloweb.northwind.projections.GetOrderDetailsProjection;
import umg.desarrolloweb.northwind.repositories.OrderRepository;
import umg.desarrolloweb.northwind.services.OrderDetailSvc;
import umg.desarrolloweb.northwind.services.OrderSvc;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class OrderSvcImpl extends CommonSvcImpl<Order, OrderRepository> implements OrderSvc {

    @Autowired
    private OrderDetailSvc orderDetailSvc;

    @Override
    @Transactional(rollbackOn = Exception.class)
    public void saveOrderAndDetail(NewOrderDto newOrderDto) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();

                long orderIdSave;
                try {
                    Order order = objectMapper.readValue(objectMapper.writeValueAsString(newOrderDto), Order.class);
                    orderIdSave = this.repository.save(order).getOrderId();
                } catch (Exception e) {
                    throw e;
                }

                try {
                    OrderDetail orderDetail = objectMapper.readValue(objectMapper.writeValueAsString(newOrderDto), OrderDetail.class);
                    orderDetail.setOrderId(orderIdSave);
                    this.orderDetailSvc.save(orderDetail);
                } catch (Exception e) {
                    throw e;
                }

        } catch (JsonProcessingException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public List<DataOrderDetailProjection> getOrdersByOrderId(String orderId) {
        try {
            return this.repository.getOrdersByOrderId(orderId);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public GetOrderDetailsProjection getOrderDetailsByOrderId(long orderDetailId) {
        try {
            return this.repository.getOrderDetailsByOrderId(orderDetailId);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    @Transactional(rollbackOn = Exception.class)
    public void deleteOrderDetailByOrderId(long orderId, long orderDetailId) {
        try {
            this.orderDetailSvc.deleteById(orderDetailId);

            try {
                this.deleteById(orderId);
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e) {
            throw e;
        }

    }
}

