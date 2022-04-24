package com.unosquare.operation.repository;

import com.unosquare.operation.domain.OperationHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface OperationHistoryRepository extends JpaRepository<OperationHistory,Long> {

    List<OperationHistory> findByTimestampAfter(@Param("baseDate")Date baseDate);
}
