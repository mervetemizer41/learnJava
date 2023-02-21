package com.challenge.beginner;

import java.util.List;
import java.util.ArrayList;

public class PrimeNumberChecker{

	public static String checkIfPrime(String numberString){
		try{
			int number = Integer.valueOf(numberString);
			int sqrtOfNumber = (int)Math.floor(Math.sqrt(number));
			System.out.println(sqrtOfNumber);
 			if(number % 2 == 0){
				return Boolean.toString(false); 			
 			}
 			int i = 3;
 			while(i <= sqrtOfNumber){
 				if(number % i == 0)
 					return Boolean.toString(false);
 				i += 2;
 			}
			return Boolean.toString(true);
		}
		catch(Exception e){
			e.printStackTrace();
			return "Invalid number array!";
		}
	 }
	
	
}
