package umg.desarrolloweb.northwind.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@Entity
@Table(name = "orderdetails", schema = "northwind")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderdetailid")
    private Long orderDetailId;

    @Column(name = "orderid")
    private Long orderId;

    @Column(name = "productid")
    private Integer productId;

    @Column(name = "quantity")
    private Integer quantity;

}

