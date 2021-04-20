package com.bridgelbaz.addressbooktest;

import com.bridgelabz.addressbook.AddressBookMain;
import com.bridgelabz.addressbook.Contact;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AddressBookTest {

    @Test
    public void givenContact_WhenAddedToAddressBook_ShouldReturn_true() {
        AddressBookMain addressBookMain = new AddressBookMain();
        Contact contact = new Contact("Samiksha", "Shende", "Ram Nagar", "Wardha", "MH", "442001", "7385697450", "shende.samiksha@gmail.com");
        List<Contact> contactList = addressBookMain.addContact(contact);
        Assertions.assertEquals(1, contactList.size());
    }

    @Test
    public void givenContactName_whenUpdated_ShouldReturn_true() {
        AddressBookMain addressBookMain = new AddressBookMain();
        Contact contact = new Contact("Samiksha", "Shende", "Ram Nagar", "Wardha", "MH", "442001", "7385697450", "shende.samiksha@gmail.com");
        List<Contact> contactList = addressBookMain.addContact(contact);
        Contact updateContact = addressBookMain.updateContact(contactList, "Samiksha", "address", "Shivaji Nagar");
        Assertions.assertEquals("Shivaji Nagar", updateContact.address);
    }

    @Test
    public void givenContactName_whenDeleted_ShouldReturn_true() {
        AddressBookMain addressBookMain = new AddressBookMain();
        Contact contact = new Contact("Samiksha", "Shende", "Ram Nagar", "Wardha", "MH", "442001", "7385697450", "shende.samiksha@gmail.com");
        List<Contact> contactList = addressBookMain.addContact(contact);
        List<Contact> deleteContactList = addressBookMain.deleteContact(contactList, "Samiksha");
        Assertions.assertEquals(0, deleteContactList.size());
    }

    @Test
    public void givenListOfContacts_whenAdded_ShouldReturn_true() {
        AddressBookMain addressBookMain = new AddressBookMain();
        List<Contact> contactDataList = new ArrayList<>();
        contactDataList.add(new Contact("Samiksha", "Shende", "Ram Nagar", "Wardha", "MH", "442001", "7385697450", "shende.samiksha@gmail.com"));
        contactDataList.add(new Contact("Apurva", "Yede", "Murarka Layout", "Wardha", "MH", "442001", "8794569789", "apurvayede@gmail.com"));
        contactDataList.add(new Contact("Neha", "Zade", "Gajanan Nagar", "Wardha", "MH", "442001", "9745073856", "neha.zade@gmail.com"));
        List<Contact> contactList = addressBookMain.addContactList(contactDataList);
        Assertions.assertEquals(3, contactList.size());
    }

    @Test
    public void whenNewAddressBookCreated_ShouldReturn_true() {
        AddressBookMain addressBookMain = new AddressBookMain();
        HashMap<String, List<Contact>> addressBookList = addressBookMain.createNewAddAddressBook("Friends");
        Assertions.assertTrue(addressBookList.containsKey("Friends"));
    }
}
