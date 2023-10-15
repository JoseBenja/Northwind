package umg.desarrolloweb.northwind.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import umg.desarrolloweb.northwind.commons.CommonController;
import umg.desarrolloweb.northwind.dtos.NewOrderDto;
import umg.desarrolloweb.northwind.models.Order;
import umg.desarrolloweb.northwind.projections.DataOrderDetailProjection;
import umg.desarrolloweb.northwind.projections.GetOrderDetailsProjection;
import umg.desarrolloweb.northwind.services.OrderSvc;

import java.util.List;

@Api
@RestController
@RequestMapping("/orders")
public class OrderController extends CommonController<Order, OrderSvc> {

    @PostMapping("/save-order-detail")
    @ApiOperation(value = "Guardar los datos de una orden nueva")
    public void saveOrderAndDetail(@RequestBody NewOrderDto newOrderDto) {
        this.service.saveOrderAndDetail(newOrderDto);
    }

    @PutMapping("/edit-order-detail")
    @ApiOperation(value = "Guardar los datos de una orden nueva")
    public void editOrderAndDetail(@RequestBody NewOrderDto newOrderDto) {
        this.service.saveOrderAndDetail(newOrderDto);
    }

    @GetMapping("/get-orders")
    @ApiOperation(value = "Obtener la ordenes hechas")
    public ResponseEntity<List<DataOrderDetailProjection>> getOrderDetails(@RequestParam(required = false) String orderId) {
        return ResponseEntity.ok(this.service.getOrdersByOrderId(orderId));
    }

    @GetMapping("/get-order-detail/{orderDetailId}")
    @ApiOperation(value = "Obtener una orden especifica para editar")
    public ResponseEntity<GetOrderDetailsProjection> getOrderDetailByOrderId(@PathVariable("orderDetailId") long orderDetailId) {
        return ResponseEntity.ok(this.service.getOrderDetailsByOrderId(orderDetailId));
    }

    @DeleteMapping("/delete-order-detail/{orderId}/{orderDetailId}")
    @ApiOperation(value = "Eliminar orden")
    public void deleteOrderDetailByOrderId(@PathVariable("orderId") long orderId, @PathVariable("orderDetailId") long orderDetailId) {
        this.service.deleteOrderDetailByOrderId(orderId, orderDetailId);
    }

}

