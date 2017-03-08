/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.addressbookv2.dao;

import com.sg.addressbookv2.dto.Address;
import com.sg.addressbookv2.dto.Email;
import com.sg.addressbookv2.dto.Phone;
import com.sg.addressbookv2.dto.SpecialDates;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class AddressbookImplTest {

    public AddressbookImplTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void encodeTest() {

        //arrange
        String expected = "1::false::Paul::Peterson:::c:Home::3652::Eakins::Rd.::The Zoo::Cuyahoga Falls::OH::44223:r::c:Primary::(330) 212-3715:r:Backup::(330) 607-4256:r::c::r::c:Birthdate::1966-11-26::Land before time:r::c:2017-03-02::2017-03-02";

        //actual
        AddressbookImpl ab = new AddressbookImpl();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        int addressId = 1;
        boolean archive = false;
        String firstName = "Paul";
        String lastName = "Peterson";
        String companyName = "";
        String addressType = "Home";
        String houseNumber = "3652";
        String streetName = "Eakins";
        String streetType = "Rd.";
        String addressLine2 = "The Zoo";
        String city = "Cuyahoga Falls";
        String state = "OH";
        String zipCode = "44223";
        ArrayList<Phone> phone = new ArrayList<>();
        String phoneType = "Primary";
        String phoneNumber = "(330) 212-3715";
        Phone p1 = new Phone(phoneType, phoneNumber);
        phoneType = "Backup";
        phone.add(p1);
        phoneNumber = "(330) 607-4256";
        Phone p2 = new Phone(phoneType, phoneNumber);
        phone.add(p2);
        ArrayList<Email> email = new ArrayList<>();
        ArrayList<SpecialDates> dates = new ArrayList<>();
        String dateDescription = "Birthdate";
        LocalDate date = LocalDate.parse("11/26/1966", formatter);
        String comment = "Land before time";
        SpecialDates sd = new SpecialDates(dateDescription, date, comment);
        dates.add(sd);
        LocalDate dateCreated = LocalDate.now();
        LocalDate dateModified = LocalDate.now();

        Address address = new Address(addressId, archive, firstName, lastName,
                    companyName, houseNumber, streetName, streetType, addressLine2, city,
                    state, zipCode, phone, email, dates, dateCreated, dateModified);
        
        String actual = ab.encode(address);
        
        //assert 
        
        assertEquals(expected, actual);
    }
}
