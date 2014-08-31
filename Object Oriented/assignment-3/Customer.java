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
public class Customer {
    protected int number;
    protected String name;
    protected String address;
    protected String telephoneNum;
    protected boolean isOnMailingList;
    
    public Customer(int number, String name, String address,String telephoneNum, boolean isOnMailingList){
        this.number = number;
        this.name = name;
        this.address = address;
        this.telephoneNum = telephoneNum;
        this.isOnMailingList = isOnMailingList;
    }
    
    public void setNumber(int number){
        this.number = number;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setTelephoneNum(String telephoneNum){
        this.telephoneNum = telephoneNum;
    }
    
    public void setisOnMailingList(boolean isOnMailingList){
        this.isOnMailingList = isOnMailingList;
    }
    
    public int getNumber(){
        return number;
    }
    
    public String setName(){
        return name;
    }
    
    public String setAddress(){
        return address;
    }
    
    public String setTelephoneNum(){
        return telephoneNum;
    }
    
    public boolean setisOnMailingList(){
        return isOnMailingList;
    }
    
    
}
