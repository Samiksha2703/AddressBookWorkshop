package com.bridgelbaz.addressbooktest;

import com.bridgelabz.addressbook.AddressBookMain;
import com.bridgelabz.addressbook.Contact;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressBookTest {

    public AddressBookMain addressBookMain;

    @Test
    public void givenContact_WhenAddedToAddressBook_ShouldReturn_true(){
        AddressBookMain addressBookMain = new AddressBookMain();
        Contact contact = new Contact("Samiksha", "Shende", "Ram Nagar", "Wardha", "MH", 442001, "7385697450", "shende.samiksha@gmail.com");
        boolean isadded = addressBookMain.addContact(contact);
        Assertions.assertTrue(isadded);
    }
}
