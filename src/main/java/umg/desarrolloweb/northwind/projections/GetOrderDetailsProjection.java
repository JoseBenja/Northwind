package umg.desarrolloweb.northwind.projections;

import java.util.Date;

public interface GetOrderDetailsProjection {

    Long getOrderId();
    Long getProductId();
    Long getCustomerId();
    Long getShipperId();
    Long getEmployeeId();
    Date getOrderDate();
    Integer getQuantity();
    Long getOrderDetailId();
}
