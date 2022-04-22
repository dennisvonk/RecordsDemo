package com.incentro.dxt.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonLombok {
    private String firstName;
    private String lastName;
    private String address;
    private LocalDate birthday;
    private List<String> achievements;
}
