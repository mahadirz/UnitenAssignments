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
public class Person {
    protected String name;
    protected String phoneNum;
    protected String address;
    
    public Person(){
        
    }
    
    public Person(String name,String phoneNum,String address){
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPhoneNum(String phoneNum){
        this.phoneNum = phoneNum;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPhoneNum(){
        return phoneNum;
    }
    
    public String getAddress(){
        return address;
    }
    
    @Override
    public String toString(){
        return "Type: Personal\n"
                +"Name: "+ name + "\n"
                +"Phone Number: "+ phoneNum + "\n"
                +"Address: "+address+"\n";
    }
}
