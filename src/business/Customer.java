/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author jmercer
 */
public class Customer extends Person {
    private String custID;
    //no-arg constructor
    public Customer(){
        super();
        this.custID="";
    }
    
    @Override
    public String getDisplayText() {
      return super.toString()+"Customer ID: "+this.custID+"\n";
    }

    /**
     * @return the custID
     */
    public String getCustID() {
        return custID;
    }

    /**
     * @param custID the custID to set
     */
    public void setCustID(String custID) {
        this.custID = custID;
    }
}
