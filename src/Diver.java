/*
 * File name: Diver.java
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

import java.util.Arrays;

/**
 * Creates attributes for a Diver object, includes equals method and overridden toString method
 * @author Christopher Runyan
 *
 */

public class Diver{
	private String firstName;
	private String lastName;
	private double[] scores;
	private double finalScore;
	
	/**
	 * Default constructor
	 */
	public Diver(){
		firstName=null;
		lastName=null;
		scores=null;
		finalScore=0;
	}
	
	/**
	 * Constructor that accepts a String value for firstName and lastName, a double array for scores, and a double
	 * for finalScore
	 * @param firstName: the first name of the diver
	 * @param lastName: the last name of the diver
	 * @param scores: a double array containing all of the diver's scores
	 * @param finalScore: the diver's calculated final score
	 */
	public Diver(String firstName, String lastName, double[] scores, double finalScore){
		this.firstName=firstName;
		this.lastName=lastName;
		this.scores=scores;
		this.finalScore=finalScore;
	}
	
	/**
	 * @return: the firstName
	 */
	public String getFirstName(){
		return firstName;
	}
	
	/**
	 * @param firstName: the firstName to set
	 */
	public void setFirstName(String firstName){
		this.firstName=firstName;
	}
	
	/**
	 * @return: the lastName
	 */
	public String getLastName(){
		return lastName;
	}
	
	/**
	 * @param lastName: the lastName to set
	 */
	public void setLastName(String lastName){
		this.lastName=lastName;
	}
	
	/**
	 * @return: the scores
	 */
	public double[] getScores(){
		return scores;
	}
	
	/**
	 * @param scores: the scores to set
	 */
	public void setScores(double[] scores){
		this.scores=scores;
	}
	
	/**
	 * @return: the finalScore
	 */
	public double getFinalScore(){
		return finalScore;
	}
	
	/**
	 * @param finalScore: the finalScore to set
	 */
	public void setFinalScore(double finalScore){
		this.finalScore=finalScore;
	}

	/* 
	 *  Overrides the default toString method to a formatted output
	 */
	@Override
	public String toString() {
		return "First Name: "+firstName+"\nLast Name: "+lastName+"\nScores: "+Arrays.toString(scores)+"\nFinal Score: "+finalScore;
	}

	/**
	 * Compares two Diver objects to see if they are the same based on the first name, last name, and final score
	 * of the diver
	 * @param diver: the diver object being compared 
	 * @return: true or false
	 */
	public boolean equals(Diver diver){
		boolean equals=false;
		if(this.firstName.equals(firstName)&&this.lastName.equals(lastName)&&this.finalScore==finalScore){
			equals=true;
		}
		return equals;
	}
	
	
}
