/*
 * File name: DateUtility.java
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
 * Creates method to format the date for output
 * @author Christopher Runyan
 *
 */

public class DateUtility{
	private String date;
	
	/**
	 * Default constructor
	 */
	public DateUtility(){
		date=null;
	}
	
	/**
	 * Constructor that accepts a String value for the date
	 * @param date: the date to set
	 */
	public DateUtility(String date){
		this.date=date;
	}
	
	/**
	 * @return: the date
	 */
	public String getDate(){
		return date;
	}

	/**
	 * @param date: the date to set
	 */
	public void setDate(String date){
		this.date=date;
	}
	
	/**
	 * Takes the date in the format read from the file and formats it for output
	 * @return: formatted date
	 */
	public String formatDate(){
		String month=null;
		
		switch(date.substring(0, 2)){
		case "1/":
		case "01":
			month="January";
			break;
		case "2/":
		case "02":
			month="Febraury";
			break;
		case "3/":
		case "03":
			month="March";
			break;
		case "4/":
		case "04":
			month="April";
			break;
		case "5/":
		case "05":
			month="May";
			break;
		case "6/":
		case "06":
			month="June";
			break;
		case "7/":
		case "07":
			month="July";
			break;
		case "8/":
		case "08":
			month="August";
			break;
		case "9/":
		case "09":
			month="September";
			break;
		case "10":
			month="October";
			break;
		case "11":
			month="November";
			break;
		case "12":
			month="December";
			break;
		}
		return month+" "+date.substring(date.indexOf('/')+1, date.lastIndexOf('/'))+", "+date.substring(date.length()-4);
	}
}
