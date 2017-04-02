/*
 * File name: DivingChampionshipDriver.java
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
 * Driver class
 * @author Christopher Runyan
 *
 */

public class DivingChampionshipDriver{
	public static void main(String[] args){
		Diver[] diver = new Diver[10];
		DivingInput input = new DivingInput();
		DivingOutput output = null;
		DateUtility dateUtility = null;
		ScoreComparator scoreCompare=null;
		
		diver=input.readInputData();
		dateUtility=new DateUtility(input.getDate());
		scoreCompare=new ScoreComparator(diver);
		output=new DivingOutput(dateUtility.formatDate(), scoreCompare.arrangeDiversByScore());
		output.printOutput();
	}
}
