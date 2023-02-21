package com.challenge.beginner;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NumberReversal{


	public static int reverseNumber(String number){
		try{	
			int numberInt = Integer.valueOf(number);
			int result = 0;
			int remainder = 0;
			
			while(numberInt > 10){	
				
				
				remainder = numberInt % 10;
				numberInt = (numberInt - remainder)  / 10;
				result = (result + remainder) * 10;
				
				System.out.println("numberInt:" + numberInt);
				System.out.println("remainder:" + remainder);
				System.out.println("result:" + result);
				
			}
			result += numberInt;
				
			
			return result;
		}
		catch(Exception e){
			return -1;
		}
	}


	

}
