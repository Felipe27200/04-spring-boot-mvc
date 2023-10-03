package com.luv2code.springboot.thymeleafdemo.model;


/*
* This class is necessary to give the
* structure of the data we receive from
* the form, so this way we can access
* it using the Student attributes
*
* */
public class Student {
    private String firstName;
    private String lastName;
    private String country;


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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
}
