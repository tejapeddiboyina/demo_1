package com.example.demo.entity;

import lombok.*;

@Data
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String id;
    private String fullName;
    private String firstName;
    private String lastName;
    private String age;
    private String designation;
    private Address address;
}
