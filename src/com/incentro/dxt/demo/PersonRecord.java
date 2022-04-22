package com.incentro.dxt.demo;

import java.time.LocalDate;
import java.util.List;

public record PersonRecord(
        String firstName,
        String lastName,
        String address,
        LocalDate birthday,
        List<String> achievements) {
}