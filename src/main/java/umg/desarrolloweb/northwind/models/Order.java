package umg.desarrolloweb.northwind.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "orders", schema = "northwind")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderid")
    private Long orderID;

    @Column(name = "customerid")
    private Integer customerID;

    @Column(name = "employeeid")
    private Integer employeeID;

    @Column(name = "orderdate")
    private Date orderDate;

    @Column(name = "shipperid")
    private Integer shipperID;

}

