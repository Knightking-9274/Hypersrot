package com.hypersrot.task.repository;

import com.hypersrot.task.model.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface OrderRepository extends JpaRepository<PurchaseOrder,Long> {
    List<PurchaseOrder> findByUserId(Long userId);


    Optional<PurchaseOrder> findByIdAndUserId(Long orderId, Long userId);

    Optional<PurchaseOrder> findByOrderId(int orderId);
}
