package umg.desarrolloweb.northwind.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "orderDetails", schema = "northwind")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderDetailid")
    private Long orderDetailID;

    @Column(name = "orderid")
    private Integer orderID;

    @Column(name = "productid")
    private Integer productID;

    @Column(name = "quantity")
    private Integer quantity;

}

