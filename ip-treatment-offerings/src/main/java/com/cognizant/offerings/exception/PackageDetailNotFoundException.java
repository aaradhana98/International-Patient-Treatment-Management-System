package com.cognizant.offerings.exception;

/**
 * 
 * @author Isha, Aaradhana, Nikhil, Adisha
 * 
 * 		custom based exception class for PackageDetailNotFoundException
 *
 */
public class PackageDetailNotFoundException  extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PackageDetailNotFoundException(String packageName) {
		super("There is no package with- "+packageName);
	}
	
	public PackageDetailNotFoundException(){
		
	}

	
}
