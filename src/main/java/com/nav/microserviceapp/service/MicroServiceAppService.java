package com.nav.microserviceapp.service;


import com.nav.microserviceapp.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MicroServiceAppService {

    public ResponseEntity<List<User>> fetchData() {
        User u1 = User.builder().name("Navneet").designation("Senior Analyst").salary(85000L).build();
        User u2 =  User.builder().name("Nakul").designation("DSE").salary(50000L).build();
        User u3 = User.builder().name("Megha").designation("Analyst").salary(46000L).build();
        return new ResponseEntity<>(List.of(u1,u2,u3), HttpStatus.OK);
    }
}
