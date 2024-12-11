package com.nav.microserviceapp.controller;

import com.nav.microserviceapp.model.Employee;
import com.nav.microserviceapp.service.MicroServiceAppService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ms")
@RequiredArgsConstructor
@Slf4j
public class MicroServiceAppController {

    private final MicroServiceAppService microServiceAppService;

    @GetMapping("/getEmployeeData")
    public ResponseEntity<List<Employee>> fetchEmployeeData(){
        log.info("The request to fetch employee data started");
        ResponseEntity<List<Employee>> employeeList = microServiceAppService.fetchData();
        log.info("The employee data fetched successfully");
        return employeeList;
    }

}
