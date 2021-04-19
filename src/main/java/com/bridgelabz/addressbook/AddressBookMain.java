package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBookMain {

   public List<Contact> contactList;

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
    }

    public void addContact(Contact contact) {
        List<Contact> contactList = new ArrayList<>();
        contactList.add(contact);
    }
}