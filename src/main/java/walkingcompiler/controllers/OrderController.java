package walkingcompiler.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import walkingcompiler.data.models.Order;
import walkingcompiler.dto.OrderDto;
import walkingcompiler.services.OrderService;
import walkingcompiler.utils.OrderMapper;

@RestController("/api")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/customerName")
    public ResponseEntity<OrderDto> findByCustomerName(@RequestBody OrderDto customerName) {
        Order orderId = orderService.findByOrderId(String.valueOf(customerName.getOrderId()));
        return new ResponseEntity<>(OrderMapper.mapToOrderDto(orderId), HttpStatus.CREATED);
    }

    @PostMapping("/Order")
    public ResponseEntity<OrderDto> Order(@RequestBody OrderDto order) {
        Order orderId = orderService.findByOrderId(String.valueOf(order.getOrderId()));
        Order foundOrder = orderService.findOrder(orderId);
        return new ResponseEntity<>(OrderMapper.mapToOrderDto(foundOrder), HttpStatus.OK);
    }
}
