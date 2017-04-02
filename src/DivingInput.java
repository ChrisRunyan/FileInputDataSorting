/*
 * File name: DivingInput.java
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

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Creates methods to read Diver data from an input file and sorts the data into a Diver object array
 * @author Christopher Runyan
 *
 */

public class DivingInput{
	private String date;
	private Diver[] diver;
	
	/**
	 * Default constructor
	 */
	public DivingInput(){
		date="1/1/1111";
		diver=new Diver[10];
	}
	
	/**
	 * @return: the date
	 */
	public String getDate(){
		return date;
	}

	/**
	 * @return: the diver
	 */
	public Diver[] getDiver(){
		return diver;
	}

	/**
	 * Reads the Diver data from the input file and sorts the data into a Diver object array
	 * @return: the Diver object array
	 */
	public Diver[] readInputData(){
		DivingCompetition divingCompetition=null;
		Scanner reader = null;
		int j=0;
		
		try{
			reader=new Scanner(new File("DivingStats.dat"));
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage()+"\nProgram terminated.");
			System.exit(1);
		}
		date=reader.nextLine();
		while(reader.hasNext()){
			int scoreCounter=0;
			double[] scores= new double[6];
			String firstName=reader.next();
			String lastName=reader.next();
			while(scoreCounter<6){
				scores[scoreCounter]=reader.nextDouble();
				scoreCounter++;
			}
			divingCompetition= new DivingCompetition(scores);
			diver[j]=new Diver(firstName, lastName, scores, divingCompetition.calculateFinalScore());
			j++;
		}
		reader.close();
		return diver;
	}
}
