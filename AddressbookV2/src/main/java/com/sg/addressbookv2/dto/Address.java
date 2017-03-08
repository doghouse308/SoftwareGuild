/*
address class contains all data for entry
 */
package com.sg.addressbookv2.dto;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Paul Peterson
 */
public class Address {

    private int addressId;
    private boolean archive;
    private String firstName;
    private String lastName;
    private String companyName;
    private String houseNumber;
    private String streetName;
    private String streetType;
    private String addressLine2;
    private String city;
    private String state;
    private String zipCode;
    private ArrayList<Phone> phone;
    private ArrayList<Email> email;
    private ArrayList<SpecialDates> date;
    private LocalDate dateCreated;
    private LocalDate dateModified;

    public Address() {

    }

    public Address(int addressId, boolean archive, String firstName, String lastName,
            String companyName, String houseNumber, String streetName, String streetType, 
            String addressLine2, String city, String state, String zipCode, 
            ArrayList<Phone> phone, ArrayList<Email> email, ArrayList<SpecialDates> date,
            LocalDate dateCreated, LocalDate dateModified) {
        this.addressId = addressId;
        this.archive = archive;
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.streetType = streetType;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phone = phone;
        this.email = email;
        this.date = date;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
    }

    /**
     * @return the addressId
     */
    public int getAddressId() {
        return addressId;
    }

    /**
     * @param addressId the addressId to set
     */
    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    /**
     * @return the archive
     */
    public boolean isArchive() {
        return archive;
    }

    /**
     * @param archive the archive to set
     */
    public void setArchive(boolean archive) {
        this.archive = archive;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    /**
     * @return the houseNumber
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * @param houseNumber the houseNumber to set
     */
    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    /**
     * @return the streetName
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * @param streetName the streetName to set
     */
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    /**
     * @return the streetType
     */
    public String getStreetType() {
        return streetType;
    }

    /**
     * @param streetType the streetType to set
     */
    public void setStreetType(String streetType) {
        this.streetType = streetType;
    }

    /**
     * @return the addressLine2
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * @param addressLine2 the addressLine2 to set
     */
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
    /**
     * @return the phone
     */
    public ArrayList<Phone> getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(ArrayList<Phone> phone) {
        this.phone = phone;
    }

    /**
     * @return the email
     */
    public ArrayList<Email> getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(ArrayList<Email> email) {
        this.email = email;
    }

    /**
     * @return the date
     */
    public ArrayList<SpecialDates> getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(ArrayList<SpecialDates> date) {
        this.date = date;
    }

    /**
     * @return the dateCreated
     */
    public LocalDate getDateCreated() {
        return dateCreated;
    }

    /**
     * @param dateCreated the dateCreated to set
     */
    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * @return the dateModified
     */
    public LocalDate getDateModified() {
        return dateModified;
    }

    /**
     * @param dateModified the dateModified to set
     */
    public void setDateModified(LocalDate dateModified) {
        this.dateModified = dateModified;
    }

    @Override
    public String toString() {
        String r = "\tFirst Name:  " + firstName + "\n\tLast Name:  " + lastName;
        if (companyName.length() > 0) {
            r += "\n\tCompany Name:  " + companyName;
        }
        r += "\n\tAddress:  " + houseNumber
                + " " + streetName + " " + streetType;
        if (!addressLine2.isEmpty()){
            r += "Address Line 2:  " + addressLine2;
        }
        r += city + ", " + state + " " + zipCode;
        if (!phone.isEmpty()) {
            r += "Phone";
            for (Phone p : phone) {
                r += p;
            }
        }
        if (!email.isEmpty()) {
            r += "Email";
            for (Email e : email) {
                r += e;
            }
        }
        if (!date.isEmpty()) {
            r += "Special Dates";
            for (SpecialDates sd : date) {
                r += sd;
            }
        }
        return r;
    }
}