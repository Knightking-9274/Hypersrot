package com.hypersrot.task.repository;

import com.hypersrot.task.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CouponReposiitory extends JpaRepository<Coupon,String> {
    Optional<Coupon> findByCode(String code);

    Optional<Coupon> findByCodeIgnoreCase(String code);
}
