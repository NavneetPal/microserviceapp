package com.nav.microserviceapp.service;


import com.nav.microserviceapp.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MicroServiceAppService {

    public ResponseEntity<List<Employee>> fetchData() {
        Employee e1 = Employee.builder().name("Navneet").designation("Senior Analyst").salary(85000L).build();
        Employee e2 =  Employee.builder().name("Nakul").designation("DSE").salary(50000L).build();
        Employee e3 = Employee.builder().name("Megha").designation("Analyst").salary(46000L).build();
        return new ResponseEntity<>(List.of(e1,e2,e3), HttpStatus.OK);
    }
}
