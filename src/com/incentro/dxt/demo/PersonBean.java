package com.incentro.dxt.demo;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class PersonBean {
    private String firstName;
    private String lastName;
    private String address;
    private LocalDate birthday;
    private List<String> achievements;

    public PersonBean(String firstName, String lastName, String address, LocalDate birthday, List<String> achievements) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.birthday = birthday;
        this.achievements = achievements;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public List<String> getAchievements() {
        return achievements;
    }

    public void setAchievements(List<String> achievements) {
        this.achievements = achievements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonBean that = (PersonBean) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(address, that.address) && Objects.equals(birthday, that.birthday) && Objects.equals(achievements, that.achievements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, address, birthday, achievements);
    }

    @Override
    public String toString() {
        return "PersonBean{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", achievements=" + achievements +
                '}';
    }
}
