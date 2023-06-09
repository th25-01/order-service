package com.example.order_service.repository;

import com.example.order_service.entity.OrderLine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OrderLineRepository extends JpaRepository<OrderLine, Long> {
    Optional<OrderLine> findByIdAndInCartEquals(Long id, boolean inCart);
}
