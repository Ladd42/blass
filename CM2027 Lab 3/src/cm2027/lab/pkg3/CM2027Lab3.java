package cm2027.lab.pkg3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import cm2027.lab.pkg3.Visitor;
import cm2027.lab.pkg3.Customer;
import java.util.Date;

/**
 *
 * @author 1309013
 */
public class CM2027Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Date date = new Date();
        
        Customer customer = new Customer(200,"Julian","Bass");
        
        Visitor visitor = new Visitor(date,"Mark","Zarb");
        
        System.out.println(visitor.toString());
    }
    
}
