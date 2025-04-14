package sample.cafekiosk.spring.api.contoller.order;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import sample.cafekiosk.spring.api.service.order.OrderService;

@RequiredArgsConstructor
@RestController
public class OrderController {

    private OrderService orderService;
}
