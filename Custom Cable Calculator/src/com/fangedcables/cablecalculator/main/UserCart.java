/*Author Hunter Barnard
 * 
 * This main point of this class is to store everything the user adds to their cart and creates.
 * This basically passes in a modified version of the basic cables types that the user creates
 * 
 */
package com.fangedcables.cablecalculator.main;

import java.util.ArrayList;

import com.fangedcables.cablecalculator.util.Cable;

public class UserCart {
	
	//Create a private arraylist of cables for the users cart
	private ArrayList<Cable> userCart;
	
	//Create the UserCart Constructor
	public UserCart() {
		//Init the users cart
		userCart = new ArrayList<Cable>();
	}
	
	//Add a cable to the users cart
	public void addCable(Cable Cable) {
		userCart.add(Cable);
	}
	//Remove a cable from the users cart
	public void removeCable(int cable) {
		userCart.remove(cable);
	}
	//get a cable in the users cart
	public Cable getCable(int cable) {
		return userCart.get(cable);
	}
	//Get the cart size
	public int getCartSize() {
		return userCart.size();
	}

}
