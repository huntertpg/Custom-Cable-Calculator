/*Author Hunter Barnard
 * 
 * This class is the main class that handles most of the users input
 * 
 */

package com.fangedcables.cablecalculator.main;

import com.fangedcables.cablecalculator.util.UserInput;

public class HandleUserInput {

	// Declare the user input var
	UserInput userInput;

	// Declare the cable types var
	CableTypes cableTypes;

	// Decalre the cart var
	UserCart cart;

	// Set the current cart index to 0
	int cartIndex = 0;

	// This is if the user is done shopping or not
	boolean done = false;

	// Create the Handler constructor that takes in an instance of the cable types
	// and the cart
	public HandleUserInput(CableTypes cableTypes, UserCart cart) {
		// Init the user input and pass in the passed in cable types
		userInput = new UserInput(cableTypes);

		// set the global cabletypes to the passed in cable types
		this.cableTypes = cableTypes;

		// set the global cart to the passed in cart
		this.cart = cart;

		// this loops until the user is done shopping
		while (!done) {

			// call the intro function.. see user function
			intro();

			// calls the handle length.. see handle length
			handleLength();

			// calls handle outro.. see handle outro
			handleOutro();

			// calls the users cart.. see print current cart
			printCurrentCart();
		}
	}

	// This function prints the current users cart
	private void printCurrentCart() {
		// First print out cart to the user
		System.out.println("Cart:");

		// This for loop loops through the cart by getting the carts size and adding one
		// to i
		for (int i = 0; i < this.cart.getCartSize(); i++) {
			// Print out the the cable by getting the cables name and then getting the
			// cables length with the current index of i
			System.out.println("Cable: " + this.cart.getCable(i).getCableName() + " Cable Length: "
					+ this.cart.getCable(i).getCableLength());
		}

	}
	
	//Create the function intro that prints the intro message and handles the users input
	private void intro() {
		//print the input message provided by the userInput utility
		userInput.printIntroMessage();
		//get the users input that returns an int
		userInput.getUserInput(1);
		//add the cable to the cart and - 1 because it's 1-* not 0-* so it starts at 0
		this.cart.addCable(cableTypes.cableTypes.get(userInput.getUserIntInput() - 1));
	}

	//Create the handle length function that asks the user for the cable length of the cable they want sleeved
	private void handleLength() {
		//Print out the length message provided by the userInput util class
		userInput.printLengthMessage();
		
		//Get the user input that should return a float
		userInput.getUserInput(2);
		
		//modify the cable currently in the cart at the current cable index with the length they need
		this.cart.getCable(cartIndex).setCableLength(userInput.getUserFloatInput());
	}
	
	//Create the handle outro function that prints out the outro for the user
	private void handleOutro() {
		
		//print the outro message provided by the userInput util class
		userInput.printEndMessage();
		
		//This loop doesn't end until it gets input from the user that they do or do not want another cable
		while (true) {
			
			//get user input in the form of a string
			userInput.getUserInput(3);
			
			//check to see if the user entered y or yes and convert them both to lowercase
			if (userInput.getUserStringInput().toLowerCase().equals("y")
					| userInput.getUserStringInput().toLowerCase().equals("yes")) {
				//increase the cart index if they want to add another cable
				cartIndex++;
				//break out of the loop because the user entered an acceptable response
				break;
			//check if the user entered n or no and convert it to lowercase if they do end the program
			} else if (userInput.getUserStringInput().toLowerCase().equals("n")
					| userInput.getUserStringInput().toLowerCase().equals("no")) {
				//set the done var to true because the user is done shopping
				this.done = true;
				//break out of the current loop because the user entered an acceptable response
				break;
				//if they don't enter y or n or yes or no it'll prompt them to enter yes or no and restart the loop
			} else {
				System.out.println("Please enter yes or no");
			}

		}

	}

}
