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
public class PreferredCustomer extends Customer {
    private double totalPurchased;
    private int discount;
    
    public PreferredCustomer(int number, String name, String address,String telephoneNum, boolean isOnMailingList){
        super(number,name,address,telephoneNum,isOnMailingList);
    }
    
    public void setTotalPurchased(double price){
        totalPurchased += price;
        if(price >= 2000)
            discount = 10;
        else if(totalPurchased >= 1500)
            discount = 7;
        else if(totalPurchased >= 1000)
            discount = 6;
        else if(totalPurchased >= 500)
            discount = 5;
    }
    
    public void setDiscount(int discount){
        this.discount = discount;
    }
    
    public double getTotalPurchased(){
        return totalPurchased;
    }
    
    public int getDiscount(){
        return discount;
    }
    
    @Override
    public String toString(){
        return "Name: "+name +"\n"
        +"Number: "+ number +"\n"
        +"Address: "+ address +"\n"
        +"Telephone: "+ telephoneNum +"\n"
        +"Total Purchase: "+ totalPurchased +"\n"
        +"Discount: "+ discount +"\n";
    }
    
    
    
    
}
