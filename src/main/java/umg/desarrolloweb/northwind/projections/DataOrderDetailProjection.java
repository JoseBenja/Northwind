package umg.desarrolloweb.northwind.projections;

import java.util.Date;

public interface DataOrderDetailProjection {

    String getCustomerName();
    String getEmployeeName();
    String getShipperName();
    String getCategoryName();
    String getSupplierName();
    String getProductName();
    Double getPrice();
    Long getOrderId();
    Long getOrderDetailId();
    Integer getQuantity();
    Date getOrderDate();
    Double getTotalCost();
}
