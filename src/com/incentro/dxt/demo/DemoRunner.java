package com.incentro.dxt.demo;

import java.time.LocalDate;
import java.util.ArrayList;

public class DemoRunner {

    public static void main(String[] args) {
        PersonBean pb = new PersonBean("Dennis", "Vonk", "Nunspeet", LocalDate.now(), new ArrayList<>());
        System.out.println(pb);

        PersonLombok pl = new PersonLombok("Dennis", "Vonk", "Nunspeet", LocalDate.now(), new ArrayList<>());
        System.out.println(pl);

        PersonRecord pr = new PersonRecord("Dennis", "Vonk", "Nunspeet", LocalDate.now(), new ArrayList<>());
        System.out.println(pr);
        System.out.println(pr.getFullName());

        try {
            final PersonRecord emptyname = new PersonRecord("", null, "Nunspeet", LocalDate.now(), new ArrayList<>());
        }
        catch (final IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
