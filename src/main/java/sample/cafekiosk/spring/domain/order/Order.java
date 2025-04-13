package sample.cafekiosk.spring.domain.order;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import sample.cafekiosk.spring.domain.BaseEntity;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
@Entity
public class Order extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    private int totalPrice;

    private LocalDateTime registeredDateTime;

}
