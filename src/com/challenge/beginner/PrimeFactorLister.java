package com.challenge.beginner;

import java.util.List;
import java.util.ArrayList;


public class PrimeFactorLister{

	public static String listPrimeFactors(String numberString){
		try{
			int number = Integer.valueOf(numberString);
			int sqrtOfNumber = (int)Math.floor(Math.sqrt(number));
			List<Integer> listNumber = new ArrayList<Integer>();
 			if(number % 2 == 0){
				listNumber.add(2); 			
 			}
 			int i = 3;
 			while(i <= sqrtOfNumber){
 				if(number % i == 0)
 					listNumber.add(i); 
 				i += 2;
 			}
 			String result = "";
 			for(Integer k : listNumber){
 				result += Integer.toString(k) + ",";
 			}
 			return result;
		}
		catch(Exception e){
			e.printStackTrace();
			return "Invalid number array!";
		}
	 }
	
	
}
