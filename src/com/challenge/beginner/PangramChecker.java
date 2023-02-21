package com.challenge.beginner;

import java.util.StringTokenizer;

public class PangramChecker{

	public static String checkIfPangram(String sentence){
		try{
			String charsOfAlphabet = "abcdefghijklmnopqrstuvwxyz";
 			boolean hasMore = false;
 			boolean found = false;
 			StringTokenizer stCharsOfAlphabet = new StringTokenizer(charsOfAlphabet, charsOfAlphabet, true);
 			StringBuilder sbSentence = new StringBuilder(sentence);
 			
			do{	
				
				
				String token = stCharsOfAlphabet.nextToken();
				
				int index = sentence.indexOf(token);
				if(index > -1){
					found = true;
				}else{
					found = false;
				}
				
				
	 			sentence = sbSentence.toString();
	 			
 				hasMore = stCharsOfAlphabet.hasMoreTokens();
 				
 				System.out.println("token:" + token);
				System.out.println("sbSentence" + sbSentence.toString());
				System.out.println("hasMore:" + hasMore);
				System.out.println("found:" + found);
				
			}while(hasMore && found);
			
			if(hasMore || !found){
				return Boolean.toString(false);
 			}else{
 				return Boolean.toString(true);
 			}
		}
		catch(Exception e){
			e.printStackTrace();
			return "Invalid word!";
		}
	 }
	
	
}
