/*
 * File name: DivingCompetition.java
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
 * Creates methods to calculate and return the final score based on a diver's scores
 * @author Christopher Runyan
 *
 */

public class DivingCompetition{
	private double[] scores;
	
	/**
	 * Default constructor
	 */
	public DivingCompetition(){
		scores=null;
	}
	
	/**
	 * Constructor that accepts a double array for scores
	 * @param scores: a double array containing all the scores of a diver
	 */
	public DivingCompetition(double[] scores){
		this.scores=scores;
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
	 * Calculates the final score by adding all the scores in the array together, subtracting the lowest and highest
	 * numbers, and averaging the remainder
	 * @return: the final score
	 */
	public double calculateFinalScore(){
		double finalScore=0;
		
		for(int i=0; i<6; i++){
			finalScore+=scores[i];
		}
		return (finalScore-=addLowestAndHighest())/4;
	}
	
	/**
	 * Finds the lowest score in the scores array
	 * @return: the lowest score
	 */
	private double findLowScore(){
		double lowScore=10;
		
		for(int i=0; i<6; i++){
			if(scores[i]<lowScore){
				lowScore=scores[i];
			}
		}
		return lowScore;
	}
	
	/**
	 * Finds the highest score in the scores array
	 * @return: the highest score
	 */
	private double findHighScore(){
		double highScore=0;
		
		for(int i=0; i<6; i++){
			if(scores[i]>highScore){
				highScore=scores[i];
			}
		}
		return highScore;
	}
	
	/**
	 * Adds the lowest and highest scores together
	 * @return: the sum of the lowest score and highest score
	 */
	private double addLowestAndHighest(){
		return findLowScore()+findHighScore();
	}
}
