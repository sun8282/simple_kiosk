package sample.cafekiosk.spring.domain.order;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum OrderStatus {

    INIT("주문 생성"),
    CANCELED("주문 취소"),
    PAYENT_COMPLETED("결제 완료"),
    RECEIVED("주문 접수"),
    COMPLETED("처리 완료");

    private final String text;

}
