package com.unosquare.operation.rest;

import com.unosquare.operation.service.OperationHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/")
public class OperationController {

    @Autowired
    private OperationHistoryService operationHistoryService;


}
