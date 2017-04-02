/*
 * File name: ScoreComparator.java
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
 * Creates method to sort the Diver array based on the final score of each Diver
 * @author Christopher Runyan
 *
 */

public class ScoreComparator {
	private Diver[] diver;
	
	/**
	 * Constructor that accepts a Diver array
	 * @param diver: a Diver array
	 */
	public ScoreComparator(Diver[] diver){
		this.diver=diver;
	}
	
	/**
	 * Sorts through the Diver array and places the Diver objects in numerical descending order based on the 
	 * final score of each Diver 
	 * @return: the sorted Diver array
	 */
	public Diver[] arrangeDiversByScore(){
		Diver hold=null;
		
		while(!(diver[0].getFinalScore()>=diver[1].getFinalScore()&&
				diver[1].getFinalScore()>=diver[2].getFinalScore()&&
				diver[2].getFinalScore()>=diver[3].getFinalScore()&&
				diver[3].getFinalScore()>=diver[4].getFinalScore()&&
				diver[4].getFinalScore()>=diver[5].getFinalScore()&&
				diver[5].getFinalScore()>=diver[6].getFinalScore()&&
				diver[6].getFinalScore()>=diver[7].getFinalScore()&&
				diver[7].getFinalScore()>=diver[8].getFinalScore()&&
				diver[8].getFinalScore()>=diver[9].getFinalScore())){
			for(int i=0; i<9; i++){
				if(diver[i].getFinalScore()<diver[i+1].getFinalScore()){
					hold=diver[i];
					diver[i]=diver[i+1];
					diver[i+1]=hold;
				}
			}
		}	
		return diver;
	}
}
