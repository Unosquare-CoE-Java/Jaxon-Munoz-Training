package com.unosquare.operation.service;

import com.unosquare.operation.domain.OperationHistory;
import com.unosquare.operation.repository.OperationHistoryRepository;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OperationHistoryService {

    @Autowired
    private OperationHistoryRepository operationHistoryRepository;

    public void getOperationHistoriesByTime(Long plusTime,boolean isHours){

        LocalDateTime startDateTime;

        if(isHours)
            startDateTime = LocalDateTime.now().plusHours(plusTime);
        else
            startDateTime = LocalDateTime.now().plusDays(plusTime);

        List<OperationHistory> operationHistories = operationHistoryRepository.findByTimestampAfter(java.sql.Date.valueOf(startDateTime.toLocalDate()));

    }

}
