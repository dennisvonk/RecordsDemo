package com.incentro.dxt.demo;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.util.List;

public record PersonRecord(
        String firstName,
        String lastName,
        String address,
        LocalDate birthday,
        List<String> achievements) {

    /**
     * <p>An example of a compact constructor, only available for records.</p>
     * <p>This is mostly used for checking if the parameters are correct.
     * </p>
     */
    public PersonRecord {
        if (StringUtils.isBlank(firstName)) {
            throw new IllegalArgumentException("firstName is not allowed to be empty, blank or null");
        }
        if (StringUtils.isBlank(lastName)) {
            throw new IllegalArgumentException("lastName is not allowed to be empty, blank or null");
        }
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}