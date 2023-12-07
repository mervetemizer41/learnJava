package com.challenge.beginner;

import java.util.StringTokenizer;

public class AnagramChecker{

	public static String checkIfAnagram(String first, String second){
		try{
			
 			boolean hasMore = false;
 			boolean found = false;
 			StringTokenizer stFirst = new StringTokenizer(first, first, true);
 			StringBuilder sbSecond = new StringBuilder(second);
 			
			do{	
				
				
				String token = stFirst.nextToken();
				
				int index = second.indexOf(token);
				if(index > -1){
					found = true;
					sbSecond.deleteCharAt(index);
				}else{
					found = false;
				}
				
				
	 			second = sbSecond.toString();
	 			
 				hasMore = stFirst.hasMoreTokens();
 				
 				System.out.println("token:" + token);
				System.out.println("sbSecond" + sbSecond.toString());
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
