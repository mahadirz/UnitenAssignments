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
public class PersonalFriend extends Person {
    
    private String homeTelephoneNumber;
    
    public PersonalFriend(){
        
    }
    
    public PersonalFriend(String name,String phoneNum,String address,String homeTelephoneNumber){
        super(name,phoneNum,address);
        this.homeTelephoneNumber = homeTelephoneNumber;
    }
    
    public void setHomeTelephoneNumber(String homeTelephoneNumber){
        this.homeTelephoneNumber = homeTelephoneNumber;
    }
    
    public String getHomeTelephoneNumber(){
        return homeTelephoneNumber;
    }
    
    @Override
    public String toString(){
        return "Type: Personal\n"
                +"Name: "+ name + "\n"
                +"Phone Number: "+ phoneNum + "\n"
                +"Address: "+address+"\n"
                +"Home Telephone Number: "+homeTelephoneNumber+"\n";
    }
}
