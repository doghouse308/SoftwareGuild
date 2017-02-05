/*
address class contains all data for entry
 */
package com.sg.addressbook.dto;

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
    private String houseNumber;
    private String streetName;
    private String streetType;
    private String city;
    private String state;
    private String zipCode;
    private ArrayList<Phone> phone;
    private ArrayList<Email> email;
    private ArrayList<SpecialDates> date;
    
    public Address(){
        
    }

    public Address(int addressId, boolean archive, String firstName, 
            String lastName, String houseNumber, String streetName,
            String streetType, String city, String state, String zipCode, 
            ArrayList<Phone> phone, ArrayList<Email> email, ArrayList<SpecialDates> date) {
        this.addressId = addressId;
        this.archive = archive;
        this.firstName = firstName;
        this.lastName = lastName;
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.streetType = streetType;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phone = phone;
        this.email = email;
        this.date = date;
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

}
