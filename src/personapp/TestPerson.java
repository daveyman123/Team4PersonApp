/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personapp;

import business.Customer;
import java.util.Scanner;
import validatiion.Validator;

/**
 *
 * @author jmercer
 */
public class TestPerson {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String choiceCE = "c";
        String choiceYN = "y";
        while (choiceYN.equalsIgnoreCase("y")) {
            
        
        System.out.println("Welcome to June's Person App");
        
        System.out.println(); //print an empty line
        choiceCE = Validator.getChoice("Create customer or employee? (c/e): ", "[ceCE]", sc);
        if (choiceCE.equalsIgnoreCase("c")) 
        {        
        Customer c=new Customer(); //instantiate a customer
        c.setFirstName(Validator.getName("Enter First Name: ", sc));
        c.setLastName(Validator.getName("Enter Last Name: ", sc));
        c.setEmailaddr(Validator.getEMail("Enter Email Addr: ", sc));
        c.setCustID((Validator.getWord("Enter Customer ID: ", sc)));
        //System.out.println(c);
        System.out.println("\nYou entered: \n" + c.getDisplayText());
    }
        else if(choiceCE.equalsIgnoreCase("e"))
        {
            ///YOUR CODE HERE!
            ///Go back to business class and create an employee class.
            ///Then instantiate an employee.
            ///Then get all of the appropriate items.
        }
        
        choiceYN = Validator.getChoice("Continue? (y/n): ", "[ynYN]", sc);
        
        } // closes while loop for choiceYN = y
        
    
    }
