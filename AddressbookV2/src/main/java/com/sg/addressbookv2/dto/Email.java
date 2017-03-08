/*
email addresses for entry
 */
package com.sg.addressbookv2.dto;

/**
 *
 * @author Paul Peterson
 */
public class Email {
    private String emailType;
    private String emailAddress;
    
    public Email(){
        
    }

    public Email(String emailType, String emailAddress) {
        this.emailType = emailType;
        this.emailAddress = emailAddress;
    }

    /**
     * @return the emailType
     */
    public String getEmailType() {
        return emailType;
    }

    /**
     * @param emailType the emailType to set
     */
    public void setEmailType(String emailType) {
        this.emailType = emailType;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "\n\tEmail Type:  " + emailType + "\n\tEmail Address:  " + emailAddress;
    }
    
}
