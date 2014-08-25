/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab6;

import java.util.InputMismatchException;

/**
 *
 * @author training
 */
public class TestCircleWithException {
	public static void main(String[] args) {
		
		try{
			CircleWithException c1 = new CircleWithException(5);
			CircleWithException c2 = new CircleWithException(-5);
			CircleWithException c3 = new CircleWithException(0);
		}		
                catch (InputMismatchException e){
                    System.out.println("In InputMismatchException");
                }
                catch (IllegalArgumentException e){
                    System.out.println("In IllegalArgumentException");
                }
                catch (Exception e){
                    System.out.println("in Exception");
                }
                finally{
                    System.out.println("finally");
                }
                
		System.out.println("Number of objects created: " + 
			CircleWithException.getNumberOfObjects());
		
	}
}

