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
public class CircleWithException {
	private double radius;
	private static int numberOfObjects=0;
	
	public CircleWithException(){
		this(1.0);
	}
	public CircleWithException(double newRadius){
		setRadius(newRadius);
		numberOfObjects++;
		
	}
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double newRadius) throws IllegalArgumentException{
		if(newRadius >=0)
			radius = newRadius;
		else
			throw new IllegalArgumentException("Radius cannot be negative");
		
	}
	public static int getNumberOfObjects(){
		return numberOfObjects;
	}
	
	public double findArea(){
		return radius * radius * 3.14159;
	}
}

