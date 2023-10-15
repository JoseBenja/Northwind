package umg.desarrolloweb.northwind.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@Entity
@Table(name = "orders", schema = "northwind")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderid")
    private Long orderId;

    @Column(name = "customerid")
    private Long customerId;

    @Column(name = "employeeid")
    private Long employeeId;

    @Column(name = "orderdate")
    private Date orderDate;

    @Column(name = "shipperid")
    private Long shipperId;

}

