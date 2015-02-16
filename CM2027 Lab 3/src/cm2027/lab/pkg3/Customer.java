package cm2027.lab.pkg3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Christopher Drysdale
 * @version 09/02/2015
 */
public class Customer extends Person {
    int customerId;

    /**
     * A constructor method for a Customer object.
     * @param customerId, The customerId assigned to the Customer object.
     * @param firstName, An inherited variable from the Person class. The customer's first name
     * @param lastName, An inherited variable from the Person class. The customer's last name
     */
    public Customer(int customerId, String firstName, String lastName) {
        super(firstName, lastName);
        this.customerId = customerId;
    }

    /**
     * A constructor method for a Customer Object.
     * @param customerId, The customerId assigned to the Customer object.
     * @param firstName, An inherited variable from the Person class. The customer's first name.
     * @param middleName, An inherited variable from the Person class. The customer's middle name.
     * @param lastName, An inherited variable from the Person class. The customer's last name.
     */
    public Customer(int customerId, String firstName, String middleName, String lastName) {
        super(firstName, middleName, lastName);
        this.customerId = customerId;
    }

    /**
     * A constructor method for a Customer Object.
     * @param customerId, The customerId assigned to the Customer object.
     * @param firstName, An inherited variable from the Person class. The customer's first name.
     * @param middleName, An inherited variable from the Person class. The customer's middle name.
     * @param lastName, An inherited variable from the Person class. The customer's last name.
     * @param postalCode, An inherited variable from the Person class. The customer's post code.
     */
    public Customer(int customerId, String firstName, String middleName, String lastName, String postalCode) {
        super(firstName, middleName, lastName, postalCode);
        this.customerId = customerId;
    }

    /**
     * A constructor method for a Customer Object.
     * @param customerId, The customerId assigned to the Customer object.
     * @param firstName, An inherited variable from the Person class. The customer's first name.
     * @param middleName, An inherited variable from the Person class. The customer's middle name.
     * @param lastName, An inherited variable from the Person class. The customer's last name.
     * @param streetAddress, An inherited variable from the Person class. The customer's street address
     * @param city, An inherited variable from the Person class. The customer's city
     * @param postalCode, An inherited variable from the Person class. The customer's post code.
     * @param country, An inherited variable from the Person class. The customer's country
     */
    public Customer(int customerId, String firstName, String middleName, String lastName, String streetAddress, String city, String postalCode, String country) {
        super(firstName, middleName, lastName, streetAddress, city, postalCode, country);
        this.customerId = customerId;
    }    

    /**
     * A getter method for the customerId
     * @return, Returns the customerId
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * A setter method for the customerId
     * @param customerId The new customerId of for the Customer object.
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    
    /**
     * A method to get the customer's full name and their customer ID
     * @return Returns the customer's information as a string.
     */
    public String getCustomerName(){
        return "Customer name: " + this.fullName + "\nCustomer ID: " + this.customerId;
    }
}
