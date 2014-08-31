/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment3;

/**
 *
 * @author Mahadir
 */
public class BusinessAssociate extends Person {
    private String officeTelephoneNumber;
    
    public BusinessAssociate(){
        
    }
    
    public BusinessAssociate(String name,String phoneNum,String address,String officeTelephoneNumber){
        super(name,phoneNum,address);
        this.officeTelephoneNumber = officeTelephoneNumber;
    }
    
    public void setOfficeTelephoneNumber(String officeTelephoneNumber){
        this.officeTelephoneNumber = officeTelephoneNumber;
    }
    
    public String getOfficeTelephoneNumber(){
        return officeTelephoneNumber;
    }
    
    @Override
    public String toString(){
        return "Type: Business\n"
                +"Name: "+ name + "\n"
                +"Phone Number: "+ phoneNum + "\n"
                +"Address: "+address+"\n"
                +"Office Telephone Number: "+officeTelephoneNumber+"\n";
    }
}
