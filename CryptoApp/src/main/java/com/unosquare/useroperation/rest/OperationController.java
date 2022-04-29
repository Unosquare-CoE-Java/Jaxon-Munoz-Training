package com.unosquare.useroperation.rest;

import com.unosquare.useroperation.service.OperationHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user/")
public class OperationController {

    @Autowired
    private OperationHistoryService operationHistoryService;


}
