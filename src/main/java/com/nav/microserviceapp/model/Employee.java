package com.nav.microserviceapp.model;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Employee {
    private String name;
    private String designation;
    private Long salary;
}
