package umg.desarrolloweb.northwind.dtos;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewOrderDto {
    private Long customerId;
    private Long employeeId;
    private Date orderDate;
    private Long shipperId;
    private Long productId;
    private Long quantity;
    private Long orderId;
    private Long orderDetailId;
}
