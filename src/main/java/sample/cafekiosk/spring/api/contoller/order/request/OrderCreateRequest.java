package sample.cafekiosk.spring.api.contoller.order.request;

import lombok.Builder;

import java.util.List;

public class OrderCreateRequest {

    private List<String> productNumbers;

    @Builder
    public OrderCreateRequest(List<String> productNumbers) {
        this.productNumbers = productNumbers;
    }
}
