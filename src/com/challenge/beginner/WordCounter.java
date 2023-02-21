package com.challenge.beginner;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class WordCounter{

	public static String countWord(String sentence, String word){
		try{
			Pattern p = Pattern.compile("(" + word + ")");
 			Matcher m = p.matcher(sentence);
 			int myMatches = 0;
			while (m.find()) {
    				myMatches++;
			}
			return Integer.toString(myMatches);
 			
		}
		catch(Exception e){
			return "Invalid sentence or word!";
		}
	}
	
	
}
