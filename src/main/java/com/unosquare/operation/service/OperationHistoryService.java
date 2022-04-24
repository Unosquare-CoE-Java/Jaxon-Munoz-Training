package com.unosquare.operation.service;

import com.unosquare.operation.repository.OperationHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperationHistoryService {

    @Autowired
    private OperationHistoryRepository operationHistoryRepository;


}
