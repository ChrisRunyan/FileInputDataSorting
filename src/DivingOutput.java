/*
 * File name: DivingOutput.java
 * 
 * Programmer: Christopher Runyan
 * ULID: caruny1
 * 
 * Date: 1/25/2016
 * 
 * Class: IT 179
 * Lecture Section: 03
 * Lecture Instructor: Cathy Holbrook
 */

package edu.ilstu;

/**
 * Creates methods to display the final output
 * @author Christopher Runyan
 *
 */

public class DivingOutput{
	private String formattedDate;
	private Diver[] diver;
	
	/**
	 * Default constructor
	 */
	public DivingOutput(){
		formattedDate=null;
		diver=null;
	}
	
	/**
	 * Constructor that accepts a String for the formatted date and an array of Diver objects
	 * @param formattedDate: the formatted date
	 * @param diver: a Diver array
	 */
	public DivingOutput(String formattedDate, Diver[] diver){
		this.formattedDate=formattedDate;
		this.diver=diver;
	}

	/**
	 * @return: the formattedDate
	 */
	public String getFormattedDate(){
		return formattedDate;
	}

	/**
	 * @param formattedDate: the formattedDate to set
	 */
	public void setFormattedDate(String formattedDate){
		this.formattedDate=formattedDate;
	}

	/**
	 * @return: the diver
	 */
	public Diver[] getDiver(){
		return diver;
	}

	/**
	 * @param diver: the diver to set
	 */
	public void setDiver(Diver[] diver){
		this.diver=diver;
	}
	
	/**
	 * Formats and displays the final report
	 */
	public void printOutput(){
		System.out.printf("%39s", "U.S. National Diving Championships\n\n");
		System.out.printf("%29s", formattedDate+"\n\n\n");
		System.out.print("PLACE");
		System.out.printf("%14s", "NAME");
		System.out.printf("%22s", "SCORE\n");
		for(int i=0; i<10; i++){
			System.out.printf("%-15s", "  "+(i+1));
			System.out.printf("%-21s", diver[i].getLastName()+", "+diver[i].getFirstName().substring(0, 1)+".");
			System.out.printf("%.1f", diver[i].getFinalScore());
			System.out.println();
		}
	}
}
