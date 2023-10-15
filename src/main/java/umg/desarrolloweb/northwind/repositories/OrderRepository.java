package umg.desarrolloweb.northwind.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import umg.desarrolloweb.northwind.models.Order;
import umg.desarrolloweb.northwind.projections.DataOrderDetailProjection;
import umg.desarrolloweb.northwind.projections.GetOrderDetailsProjection;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Object> {

    @Query(value = "select \n" +
            "od.orderid as orderId,\n" +
            "od.quantity as quantity,\n" +
            "date(o.orderdate) as orderDate,\n" +
            "c.customername as customerName,\n" +
            "e.firstname || ' ' || e.lastname as employeeName,\n" +
            "s.shippername as shipperName,\n" +
            "p.productname as productName, \n" +
            "p.price as price,\n" +
            "sp.suppliername as supplierName,\n" +
            "cg.categoryname as categoryName, \n" +
            "(p.price * od.quantity) as totalCost,\n" +
            "od.orderdetailid as orderDetailId \n" +
            "from northwind.orderdetails od \n" +
            "left join northwind.orders o on o.orderid = od.orderid \n" +
            "left join northwind.customers c on c.customerid = o.customerid \n" +
            "left join northwind.employees e on e.employeeid = o.employeeid \n" +
            "left join northwind.shippers s on s.shipperid = o.shipperid \n" +
            "left join northwind.products p on p.productid = od.productid \n" +
            "left join northwind.categories cg on cg.categoryid = p.categoryid \n" +
            "left join northwind.suppliers sp on sp.supplierid = p.supplierid \n" +
            "where cast(od.orderid as text) = coalesce(cast(:orderId as text), cast(od.orderid as text));\n",
            nativeQuery = true)
    public List<DataOrderDetailProjection> getOrdersByOrderId(@Param("orderId") String orderId);

    @Query(value = "select \n" +
            "o.orderid as orderId,\n" +
            "o.customerid as customerId,\n" +
            "o.employeeid as employeeId,\n" +
            "date(o.orderdate) as orderDate,\n" +
            "o.shipperid as shipperId,\n" +
            "od.productid as productId,\n" +
            "od.quantity as quantity, \n" +
            "od.orderdetailid as orderDetailId " +
            "from northwind.orderdetails od \n" +
            "right join northwind.orders o on o.orderid = od.orderid \n" +
            "where od.orderdetailid = :orderDetailId ",
            nativeQuery = true)
    public GetOrderDetailsProjection getOrderDetailsByOrderId(@Param("orderDetailId") long orderDetailId);

}

