//Sagar Patel, CSCI 1660, 3/9/2020, Exercise 10

package com.company.Patel;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<ContactInfo> contactInfoArrayList = new ArrayList<>();
        ContactInfo contactInfo = new ContactInfo("Sagar Patel", "083401@swcsd.us");
        ContactInfo contactInfo1 = new ContactInfo("Gaige Wycuff", "119770@swcsd.us");
        contactInfoArrayList.add(contactInfo);
        contactInfoArrayList.add(contactInfo1);

        Collection collection = new Collection(contactInfoArrayList);
        for (ContactInfo contact : collection) {
            contact.display();
        }

    }
}
