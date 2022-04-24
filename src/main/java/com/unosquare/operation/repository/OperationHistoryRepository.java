package com.unosquare.operation.repository;

import com.unosquare.operation.domain.OperationHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationHistoryRepository extends JpaRepository<OperationHistory,Long> {
}
