package com.bridgelbaz.addressbooktest;

import com.bridgelabz.addressbook.AddressBookMain;
import com.bridgelabz.addressbook.Contact;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class AddressBookTest {

    private AddressBookMain addressBookMain;

    @Before
    public void initialize() {
        AddressBookMain addressBookMain = new AddressBookMain();
    }

    @Test
    public void givenContact_WhenAddedToAddressBook_ShouldReturn_true(){
        Contact contact = new Contact("Samiksha", "Shende", "Ram Nagar", "Wardha", "MH", 442001, "7385697450", "shende.samiksha@gmail.com"); )
        addressBookMain.addContact(contact);
    }
}
