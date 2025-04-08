package sample.cafekiosk.spring.domain.product;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ProductSellingType {

    SELLING("판매중"),
    HOLD("판매보류"),
    STOP_SELLING("판매중지");

    private final String text;

}
