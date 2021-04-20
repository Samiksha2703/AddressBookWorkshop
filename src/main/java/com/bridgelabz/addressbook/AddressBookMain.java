package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AddressBookMain {

    public static List<Contact> contactList = new ArrayList<>();
    public static HashMap<String, List<Contact>> addressBookMap;

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
    }

    public List<Contact> addContact(Contact contact) {
        try {
            contactList.add(contact);
            System.out.println("Contact Added Successfully.");
            return contactList;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contactList;
    }

    public Contact updateContact(List<Contact> contactList, String name, String fieldName, String update) {
        try {
            for (Contact contact : contactList) {
                if (contact.firstName.equals(name)) {
                    switch (fieldName) {
                        case "firstName":
                            contact.firstName = update;
                            break;
                        case "lastName":
                            contact.lastName = update;
                            break;
                        case "address":
                            contact.address = update;
                            break;
                        case "city":
                            contact.city = update;
                            break;
                        case "state":
                            contact.state = update;
                            break;
                        case "zip":
                            contact.zip = update;
                            break;
                        case "phone":
                            contact.phone = update;
                            break;
                        case "email":
                            contact.email = update;
                            break;
                    }
                }
                return contact;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Contact> deleteContact(List<Contact> contactList, String name) {
        try {
            for (Contact contact : contactList) {
                if (contact.firstName.equals(name)) {
                    contactList.remove(contactList.indexOf(contact));
                    System.out.println("Contact deleted with name : " + name);
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contactList;
    }

    public List<Contact> addContactList(List<Contact> contactDataList) {
        try {
            for (Contact contact : contactDataList) {
                addContact(contact);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contactList;
    }

    public HashMap<String, List<Contact>> createNewAddAddressBook(String addressBookName) {
        addressBookMap = new HashMap<>();
        try {
            addressBookMap.put(addressBookName, new ArrayList<Contact>());
            System.out.println("New Address Book Created with Name : " + addressBookName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return addressBookMap;
    }
}