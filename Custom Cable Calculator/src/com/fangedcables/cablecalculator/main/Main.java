/* @Author: Hunter Barnard Property of FangedCables
 * 
 * This class is the main Java class. This is just used for main function calls that operate the program
 * 
 */

package com.fangedcables.cablecalculator.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Create the cable types class to handle the different cable types
		CableTypes cableTypes = new CableTypes();
		
		//Create the user cart that holds all the users cables they want sleeved
		UserCart userCart = new UserCart();
		//Create the handle input class. This is the backbone for the text input portion as of right now
		HandleUserInput handleInput = new HandleUserInput(cableTypes, userCart);
	}
}
