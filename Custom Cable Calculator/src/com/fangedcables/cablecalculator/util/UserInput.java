/*Author Hunter Barnard
 * 
 * This class is mostly a utility class that is used for getting user input and printing basic messages to the user
 * 
 */

package com.fangedcables.cablecalculator.util;

import java.util.Scanner;

import com.fangedcables.cablecalculator.main.CableTypes;

public class UserInput {

	private Scanner userInput;
	private CableTypes cableTypes;
	private float userFloatInput;
	private String userStringInput;
	private int userIntInput;

	public UserInput(CableTypes cableTypes) {
		this.cableTypes = cableTypes;
		userInput = new Scanner(System.in);
	}

	public void printIntroMessage() {
		System.out.println("\nEnter Cable Type");
		for (int i = 0; i < cableTypes.cableTypes.size(); i++) {
			System.out.println(i + 1 + ". " + cableTypes.cableTypes.get(i).getCableName());
		}
	}

	public void printLengthMessage() {
		System.out.println("\nWhat is the length of the cable in feet?");
	}

	public void printEndMessage() {
		System.out.println("\nAdd anymore cables? Y/n");
	}

	public void getUserInput(int typeOfInput) {
		if (typeOfInput == 1) {
			userIntInput = userInput.nextInt();
		}
		if (typeOfInput == 2) {
			userFloatInput = userInput.nextFloat();
		}
		if (typeOfInput == 3) {
			userStringInput = userInput.nextLine();
		}
	}

	public float getUserFloatInput() {
		return this.userFloatInput;
	}

	public int getUserIntInput() {
		return this.userIntInput;
	}

	public String getUserStringInput() {
		return this.userStringInput;
	}

}
