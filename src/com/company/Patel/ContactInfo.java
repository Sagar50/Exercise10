//Sagar Patel, CSCI 1660, 3/9/2020, Exercise 10

package com.company.Patel;

public class ContactInfo {
    String name;
    String email;

    public ContactInfo(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void display() {
        System.out.println("The name is: " + name + " | The email is: " + email );

    }
}