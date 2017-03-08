/*
phone numbers for entry
 */
package com.sg.addressbookv2.dto;

/**
 *
 * @author Paul Peterson
 */
public class Phone {
    private String phoneType;
    private String phoneNumber;
    
    public Phone (){
        
    }

    public Phone(String phoneType, String phoneNumber) {
        this.phoneType = phoneType;
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the phoneType
     */
    public String getPhoneType() {
        return phoneType;
    }

    /**
     * @param phoneType the phoneType to set
     */
    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "\n\tPhone Type:   " + phoneType + "\n\tPhone Number:  " + phoneNumber;
    }
    
}
