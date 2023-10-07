package umg.desarrolloweb.northwind.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "shippers", schema = "northwind")
public class Shipper {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipperid")
    private Long shipperId;

    @Column(name = "shippername")
    private String shipperName;

    @Column(name = "phone")
    private String phone;

}

