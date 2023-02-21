package com.challenge.beginner;


public class NthWordFinder{

	public static String findNthWord(String sentence, int n){
		try{
			String[] sArray = sentence.split(" ");
			return sArray[n-1];
		}
		catch(Exception e){
			return "Invalid sentence or number for nth word finding!";
		}
	}
	
	
}
