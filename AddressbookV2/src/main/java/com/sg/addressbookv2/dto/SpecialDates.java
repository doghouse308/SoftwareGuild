/*
special dates for entry such as birthdays, anniversaries, etc
comments available for each date
 */
package com.sg.addressbookv2.dto;

import java.time.LocalDate;

/**
 *
 * @author Paul Peterson
 */
public class SpecialDates {
    
    private String dateDescription;
    private LocalDate date;
    private String comment;

    public SpecialDates(){
        
    }

    public SpecialDates(String dateDescription, LocalDate date, String comment) {
        this.dateDescription = dateDescription;
        this.date = date;
        this.comment = comment;
    }
    
    /**
     * @return the dateDescription
     */
    public String getDateDescription() {
        return dateDescription;
    }

    /**
     * @param dateDescription the dateDescription to set
     */
    public void setDateDescription(String dateDescription) {
        this.dateDescription = dateDescription;
    }

    /**
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "\n\tDate Description:  " + dateDescription + "\n\tDate:  " 
                + date + "\n\tComment:  " + comment + '}';
    }
    
}
