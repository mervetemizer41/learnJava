package com.challenge.beginner;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WordReversal{


	public static String reverseUsingList(String sentence){
		try{
			String[] sArray = sentence.split(" ");
			List<String> listOfStrings = Arrays.asList(sArray);
			Collections.reverse(listOfStrings);
			String reversed = "";
			for(String s : listOfStrings){
				reversed += s;
				reversed += " ";
			}
			return reversed;
		}
		catch(Exception e){
			return "Invalid sentence for WordReversal!";
		}
	}


	

}
