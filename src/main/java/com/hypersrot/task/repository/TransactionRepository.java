package com.hypersrot.task.repository;

import com.hypersrot.task.model.TransactionResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionResult,Long> {

}
