package cm2027.lab.pkg3;

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
public class Person {
    String firstName;
    String middleName;
    String lastName;
    String fullName;
    String address;
    String streetAddress;
    String city;
    String postalCode;
    String country;
    
    /**
     * A constructor method for the Person object
     * @param firstName, The first name of the person
     * @param lastName, The last name of the person
     */
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }
    
    /**
     * A constructor method for the Person object
     * @param firstName, The first name of the person
     * @param middleName, The middle name of the person
     * @param lastName, The lastName of the person
     */
    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }
    
    /**
     * A constructor method for the Person object
     * @param firstName, The first name of the person
     * @param middleName, The middle name of the person
     * @param lastName, The last name of the person
     * @param postalCode, The post code of the person.
     */
    public Person(String firstName, String middleName, String lastName, String postalCode) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.fullName = firstName + " " + middleName + " " + lastName;
        this.postalCode = postalCode;
        this.address = postalCode;
    }

    /**
     * A constructor method for the Person object
     * @param firstName, The first name of the person
     * @param middleName, The middle name of the person
     * @param lastName, The last name of the person
     * @param streetAddress, The first line of the person's address
     * @param city, The city the person lives in.
     * @param postalCode, The post code of the person
     * @param country , The country the person lives in
     */
    public Person(String firstName, String middleName, String lastName, String streetAddress, String city, String postalCode, String country) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.fullName = firstName + " " + middleName + " " + lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
        this.address = streetAddress + "\n" + city + "\n" + country + "\n" + postalCode;
    }
    
    /**
     * A getter method for the address of the Person
     * @return, Returns the address of the Person object.
     */
    public String getAddress() {
        return address;
    }
    
    /**
     * A getter method for the Person's first name
     * @return, Returns the first name of the person.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * A setter method for the Person's first name
     * @param firstName, Sets the first name of the Person to this variable
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * A getter method for the Person's last name
     * @return, Returns the last name of the Person object.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * A setter method for the Person's last name
     * @param lastName , Sets the last name of the Person to this variable
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * A getter method for the Person's full name
     * @return, Returns the full name of the Person object.
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * A setter method for the full name of the Person object.
     * @param firstName, The person's new firstName
     * @param middleName, The person's new middleName
     * @param lastName, The person's new lastName
     * @param postCode, The person's new postCode
     */
    public void setFullName(String firstName, String middleName, String lastName, String postCode) {
        this.fullName = firstName + " " + middleName + " " + lastName;
        this.postalCode = postCode;
    }
  
    /**
     * A setter method for the full name of the Person object.
     * @param firstName, The person's new firstName
     * @param middleName, The person's new middleName
     * @param lastName, The person's new lastName
     */
    public void setFullName(String firstName, String middleName, String lastName){
        this.fullName = firstName + " " + middleName + " " + lastName;
    }
    
    /**
     * A setter method for the full name of the Person object
     * @param firstName, The person's new firstName
     * @param lastName,  The person's new lastName
     */
    public void setFullName(String firstName, String lastName){
        this.fullName = firstName + " " + lastName;
    }
    
    /**
     * A toString to output the name of the person and where they live.
     * @return The formatted string output message, containing the Person information.
     */
    @Override
    public String toString() {
        return "This person's name is,  " + this.fullName + "\nThey live at: " + address;
    }
    
    
}
