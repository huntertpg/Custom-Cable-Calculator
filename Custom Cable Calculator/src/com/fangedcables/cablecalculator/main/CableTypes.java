/*Author Hunter Barnard
 * This class contains the different types of cables that can be currently sleeved. 
 * This is done in an array list and passing in the attributes to the Cable class to define a new cable
 */

package com.fangedcables.cablecalculator.main;

import java.util.ArrayList;

import com.fangedcables.cablecalculator.util.Cable;

public class CableTypes {
	
	//This is the default length of the cable if there isn't one provided
	private float defaultCableLength = 2f;
	
	//Declare the cableTypes ArrayList
	public ArrayList<Cable> cableTypes;
	
	//Create the CableTypes constructor
	public CableTypes() {
		//Create the array list comprised of cables
		cableTypes = new ArrayList<Cable>();
		
		//Add All of the computer internal computer cables here
		cableTypes.add(new Cable(24, "24 Pin Motherboard Cable", defaultCableLength));
		cableTypes.add(new Cable(20, "20 Pin Motherboard Cable", defaultCableLength));
		cableTypes.add(new Cable(24, "20+4 pin Motherboard Cable", defaultCableLength));
		cableTypes.add(new Cable(4, "4 pin ATX", defaultCableLength));
		cableTypes.add(new Cable(8, "8 pin EPS", defaultCableLength));
		cableTypes.add(new Cable(8, "4+4 pin EPS", defaultCableLength));
		cableTypes.add(new Cable(6, "6 pin PCI-E", defaultCableLength));
		cableTypes.add(new Cable(8, "8 pin PCI-E", defaultCableLength));
		cableTypes.add(new Cable(8, "6+2 pin PCI-E", defaultCableLength));
	}
	

}
