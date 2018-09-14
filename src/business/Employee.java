/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author twalters25
 */
public class Employee extends Person {
    private int SSN;
    
    public Employee(){
    super();
    this.SSN = 0;
    }

    @Override
    public String getDisplayText() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the SSN
     */
    public int getSSN() {
        return SSN;
    }

    /**
     * @param SSN the SSN to set
     */
    public void setSSN(int SSN) {
        this.SSN = SSN;
    }
    
}
