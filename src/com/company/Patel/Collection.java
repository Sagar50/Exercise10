//Sagar Patel, CSCI 1660, 3/9/2020, Exercise 10
package com.company.Patel;
import java.util.ArrayList;
import java.util.Iterator;


public class Collection implements Iterable<ContactInfo> {
    ArrayList<ContactInfo> contactInfo;

    public Collection(ArrayList<ContactInfo> contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public Iterator<ContactInfo> iterator() {
        return contactInfo.iterator();
    }
}