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
public class TestCustomer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PreferredCustomer ps1 = new PreferredCustomer(100,"Muizz","No. 4 Kuala Lumpur","0123456764",true);
        PreferredCustomer ps2 = new PreferredCustomer(200,"Khalid","No. 5 Kuala Lumpur","0123456765",false);
        PreferredCustomer ps3 = new PreferredCustomer(300,"Chong","No. 6 Kuala Lumpur","0123456767",true);
        PreferredCustomer ps4 = new PreferredCustomer(400,"Sami","No. 7 Kuala Lumpur","0123456761",false);
        PreferredCustomer ps5 = new PreferredCustomer(500,"David","No. 8 Kuala Lumpur","0123456762",true);
        
        ps1.setTotalPurchased(300);
        System.out.println(ps1);
        
        ps2.setTotalPurchased(551);
        System.out.println(ps2);
        
        ps3.setTotalPurchased(1000);
        System.out.println(ps3);
        
        ps4.setTotalPurchased(1600);
        System.out.println(ps4);
        
        ps5.setTotalPurchased(3000);
        System.out.println(ps5);
    }
    
}
