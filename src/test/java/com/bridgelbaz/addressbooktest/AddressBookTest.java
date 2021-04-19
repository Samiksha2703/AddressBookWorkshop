package com.bridgelbaz.addressbooktest;

import com.bridgelabz.addressbook.AddressBookMain;
import com.bridgelabz.addressbook.Contact;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class AddressBookTest {

    @Test
    public void givenContact_WhenAddedToAddressBook_ShouldReturn_true(){
        AddressBookMain addressBookMain = new AddressBookMain();
        Contact contact = new Contact("Samiksha", "Shende", "Ram Nagar", "Wardha", "MH", "442001", "7385697450", "shende.samiksha@gmail.com");
        List<Contact> contactList = addressBookMain.addContact(contact);
        Assertions.assertEquals(1, contactList.size());
    }

    @Test
    public void givenContactName_whenUpdated_ShouldReturn_true(){
        AddressBookMain addressBookMain = new AddressBookMain();
        Contact contact = new Contact("Samiksha", "Shende", "Ram Nagar", "Wardha", "MH", "442001", "7385697450", "shende.samiksha@gmail.com");
        List<Contact> contactList = addressBookMain.addContact(contact);
        Contact updateContact = addressBookMain.updateContact(contactList, "Samiksha", "address","Shivaji Nagar");
        Assertions.assertEquals("Shivaji Nagar", updateContact.address);
    }
}
