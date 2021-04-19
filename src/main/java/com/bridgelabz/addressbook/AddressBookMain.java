package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBookMain {

   public List<Contact> contactList;

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
    }

    public boolean addContact(Contact contact) {
        List<Contact> contactList = new ArrayList<>();
        try {
            contactList.add(contact);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}