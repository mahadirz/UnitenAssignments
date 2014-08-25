/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab6;

/**
 *
 * @author training
 */
class TestPowerFailureExceptions {
    public static void main(String[] args) {
        
    }
}

public class PowerFailureExceptions extends Exception{
    public PowerFailureExceptions(){
        super("default power failure!");
    }
    
    public PowerFailureExceptions(String msg){
        super(msg);
    }
    
    
}