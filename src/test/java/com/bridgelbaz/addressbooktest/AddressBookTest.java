package com.bridgelbaz.addressbooktest;

import com.bridgelabz.addressbook.AddressBookMain;
import com.bridgelabz.addressbook.Contact;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AddressBookTest {

    @Test
    public void givenContact_WhenAddedToAddressBook_ShouldReturn_true() {
        AddressBookMain addressBookMain = new AddressBookMain();
        Contact contact = new Contact("Samiksha", "Shende", "Ram Nagar", "Wardha", "MH", "442001", "7385697450", "shende.samiksha@gmail.com");
        HashMap<String, List<Contact>> contactList = addressBookMain.addContact("Family", contact);
        Assertions.assertEquals(1, contactList.get("Family").size());
    }

    @Test
    public void givenContactName_whenUpdated_ShouldReturn_true() {
        AddressBookMain addressBookMain = new AddressBookMain();
        Contact contact = new Contact("Samiksha", "Shende", "Ram Nagar", "Wardha", "MH", "442001", "7385697450", "shende.samiksha@gmail.com");
        HashMap<String, List<Contact>> contactList = addressBookMain.addContact("Family", contact);
        boolean result = addressBookMain.updateContact(contactList, "Family", "Samiksha", "address", "Shivaji Nagar");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenContactName_whenDeleted_ShouldReturn_true() {
        AddressBookMain addressBookMain = new AddressBookMain();
        Contact contact = new Contact("Samiksha", "Shende", "Ram Nagar", "Wardha", "MH", "442001", "7385697450", "shende.samiksha@gmail.com");
        HashMap<String, List<Contact>> contactList = addressBookMain.addContact("Family", contact);
        boolean result = addressBookMain.deleteContact(contactList, "Family", "Samiksha");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenListOfContacts_whenAdded_ShouldReturn_true() {
        AddressBookMain addressBookMain = new AddressBookMain();
        List<Contact> contactDataList = new ArrayList<>();
        contactDataList.add(new Contact("Samiksha", "Shende", "Ram Nagar", "Wardha", "MH", "442001", "7385697450", "shende.samiksha@gmail.com"));
        contactDataList.add(new Contact("Apurva", "Yede", "Murarka Layout", "Wardha", "MH", "442001", "8794569789", "apurvayede@gmail.com"));
        contactDataList.add(new Contact("Neha", "Zade", "Gajanan Nagar", "Wardha", "MH", "442001", "9745073856", "neha.zade@gmail.com"));
        HashMap<String, List<Contact>> contactList = addressBookMain.addContactList("Family", contactDataList);
        Assertions.assertEquals(3, contactList.get("Family").size());
    }

    @Test
    public void whenNewAddressBookCreated_ShouldReturn_true() {
        AddressBookMain addressBookMain = new AddressBookMain();
        HashMap<String, List<Contact>> addressBookList = addressBookMain.createNewAddAddressBook("Friends");
        Assertions.assertTrue(addressBookList.containsKey("Friends"));
    }

    @Test
    public void givenListOfContacts_whenDuplicateContact_ShouldPassTheTest() {
        AddressBookMain addressBookMain = new AddressBookMain();
        List<Contact> contactDataList = new ArrayList<>();
        contactDataList.add(new Contact("Samiksha", "Shende", "Ram Nagar", "Wardha", "MH", "442001", "7385697450", "shende.samiksha@gmail.com"));
        contactDataList.add(new Contact("Apurva", "Yede", "Murarka Layout", "Wardha", "MH", "442001", "8794569789", "apurvayede@gmail.com"));
        contactDataList.add(new Contact("Samiksha", "Zade", "Gajanan Nagar", "Wardha", "MH", "442001", "9745073856", "neha.zade@gmail.com"));
        HashMap<String, List<Contact>> contactList = addressBookMain.addContactList("Family", contactDataList);
        Assertions.assertNotEquals(3, contactList.get("Family").size());
    }
}
