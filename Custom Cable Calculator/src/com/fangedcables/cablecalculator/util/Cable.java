/*@Author Hunter Barnard
 *
 * This class is the base of any cable created. It contains everything that makes up a cable
 * such as length, number of pins(that determines the number of wires), and the name of the cable 
 * 
 */

package com.fangedcables.cablecalculator.util;

public class Cable {
	
	//Create the private variable pins that is an int
	private int pins;
	
	//Create a float of the cable length
	private float cableLength;
	
	//Create a private string containing the cable name
	private String cableName;

	//Create the constructor that takes in the pins, cable name, and the length of the cable
	public Cable(int pins, String cableName, float cableLength) {
		
		//Set the global pin variable to the one passed in
		this.pins = pins;
		
		//Set the global cable name variable to the one passed in
		this.cableName = cableName;
		
		//Set the global cable length to the on passed in
		this.cableLength = cableLength;
	}

	//Get the number of pins and return it as an int
	public int getPins() {
		return pins;
	}
	
	//Get the cable length and return it as a float
	public float getCableLength() {
		return this.cableLength;
	}

	//Get the cable name and return it as a string
	public String getCableName() {
		return cableName;
	}
	
	//Set the number of pins if it needs to change
	public void setPins(int pins) {
		this.pins = pins;
	}
	
	//Set the cable length
	public void setCableLength(float cableLength) {
		this.cableLength = cableLength;
	}
	//Set the cable name
	public void setCableName(String cableName) {
		this.cableName = cableName;
	}

}
