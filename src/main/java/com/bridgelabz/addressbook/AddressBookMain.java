package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {

    public static List<Contact> contactList = new ArrayList<>();
    public static HashMap<String, List<Contact>> addressBookMap = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
    }

    public HashMap<String, List<Contact>> addContact(String addressBookName, Contact contact) {
        try {
            if (!addressBookMap.containsKey(addressBookName)) {
                createNewAddAddressBook(addressBookName);
            }
            boolean check = checkDuplicate(addressBookMap, addressBookName, contact);
            if (!check) {
                addressBookMap.get(addressBookName).add(contact);
                System.out.println("Contact Added Successfully.");
            } else return addressBookMap;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return addressBookMap;
    }

    private boolean checkDuplicate(HashMap<String, List<Contact>> addressBookMap, String addressBookName, Contact contact) {
        contactList = addressBookMap.get(addressBookName);
        long count = contactList.stream().filter(data -> data.firstName.equals(contact.firstName)).count();
        if (count == 0) return true;
        return false;
    }

    public boolean updateContact(HashMap<String, List<Contact>> addressBookList, String addressBookName, String name, String fieldName, String update) {
        try {
            if (addressBookList.containsKey(addressBookName)) {
                List<Contact> contactList = addressBookList.get(addressBookName);
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
                        System.out.println("Contact updated with name : " + name);
                    }
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteContact(HashMap<String, List<Contact>> addressBookList, String addressBookName, String name) {
        try {
            if (addressBookList.containsKey(addressBookName)) {
                List<Contact> contactList = addressBookList.get(addressBookName);
                for (Contact contact : contactList) {
                    if (contact.firstName.equals(name)) {
                        contactList.remove(contactList.indexOf(contact));
                        System.out.println("Contact deleted with name : " + name);
                        break;
                    }
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public HashMap<String, List<Contact>> addContactList(String addressBookName, List<Contact> contactDataList) {
        try {
            for (Contact contact : contactDataList) {
                addContact(addressBookName, contact);
            }
            return addressBookMap;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return addressBookMap;
    }

    public HashMap<String, List<Contact>> createNewAddAddressBook(String addressBookName) {
        try {
            addressBookMap.put(addressBookName, new ArrayList<Contact>());
            System.out.println("New Address Book Created with Name : " + addressBookName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return addressBookMap;
    }
}