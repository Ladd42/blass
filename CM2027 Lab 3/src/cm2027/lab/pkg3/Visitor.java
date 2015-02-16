package cm2027.lab.pkg3;


import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Christopher Drysda;e
 * @version 09/02/2015
 */
public class Visitor extends Person {

    public Date visitDate;

    
    /**
     * 
     * @param visitDate, The date the visitor has visited.
     * @param firstName, An inherited variable from the Person class. The customer's first name
     * @param lastName, An inherited variable from the Person class. The customer's last name
     */
    public Visitor(Date visitDate, String firstName, String lastName) {
        super(firstName, lastName);
        this.visitDate = visitDate;
    }

    /**
     * 
     * @param visitDate, The date the visitor has visited.
     * @param firstName, An inherited variable from the Person class. The customer's first name.
     * @param middleName, An inherited variable from the Person class. The customer's middle name.
     * @param lastName, An inherited variable from the Person class. The customer's last name. 
     */
    public Visitor(Date visitDate, String firstName, String middleName, String lastName) {
        super(firstName, middleName, lastName);
        this.visitDate = visitDate;
    }

    /**
     * 
     * @param visitDate, The date the visitor has visited.
     * @param firstName, An inherited variable from the Person class. The customer's first name.
     * @param middleName, An inherited variable from the Person class. The customer's middle name.
     * @param lastName, An inherited variable from the Person class. The customer's last name.
     * @param postalCode, An inherited variable from the Person class. The customer's post code.
     */
    public Visitor(Date visitDate, String firstName, String middleName, String lastName, String postalCode) {
        super(firstName, middleName, lastName, postalCode);
        this.visitDate = visitDate;
    }

    /**
     * 
     * @param visitDate, The date the visitor has visited.
     * @param firstName, An inherited variable from the Person class. The customer's first name.
     * @param middleName, An inherited variable from the Person class. The customer's middle name.
     * @param lastName, An inherited variable from the Person class. The customer's last name.
     * @param streetAddress, An inherited variable from the Person class. The customer's street address
     * @param city, An inherited variable from the Person class. The customer's city
     * @param postalCode, An inherited variable from the Person class. The customer's post code.
     * @param country, An inherited variable from the Person class. The customer's country
     */
    public Visitor(Date visitDate, String firstName, String middleName, String lastName, String streetAddress, String city, String postalCode, String country) {
        super(firstName, middleName, lastName, streetAddress, city, postalCode, country);
        this.visitDate = visitDate;
    }

    /**
     * A getter method for the date a visitor visited
     * @return The visitDate for the visitor object
     */
    public Date getVisitDate() {
        return visitDate;
    }

    /**
     * A setter method to change the date in which a visitor visited
     * @param visitDate , the new date which the visitor visited
     */
    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    /**
     * A method to get the visitor's full name and the date which they visited
     * @return Returns the visitor's information as a string.
     */
    @Override
    public String toString() {
        return "Visitor name: " + this.fullName + "\nVisited on: " + this.visitDate;
    }
    
    
}
