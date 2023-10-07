package umg.desarrolloweb.northwind.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "products", schema = "northwind")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productid")
    private Long productId;

    @Column(name = "productname")
    private String productName;

    @Column(name = "supplierid")
    private Integer supplierId;

    @Column(name = "categoryid")
    private Integer categoryId;

    @Column(name = "unit")
    private String unit;

    @Column(name = "price")
    private Double price;

}

