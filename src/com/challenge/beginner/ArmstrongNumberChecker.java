package com.challenge.beginner;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArmstrongNumberChecker{

	public static int power(int a, int b)
	{
		int power = 1;

		for(int c = 0; c < b; c++)
		    power *= a;

		return power;
	}
	public static String checkArmstrongNumber(String number){
		try{	
			List<Integer> digits = new ArrayList<Integer>();
			int checkNumber = Integer.valueOf(number);
			int numberInt = Integer.valueOf(number);
			int remainder = 0;
			int result = 0;
			int count = 0;
			
			while(numberInt > 0){	
				
				
				remainder = numberInt % 10;
				digits.add(remainder);
				numberInt = (numberInt - remainder)  / 10;
				
				System.out.println("numberInt:" + numberInt);
				System.out.println("remainder:" + remainder);
				count++;
			}
			
			System.out.println("count:" + count);
			for(Integer i : digits){
				result += power(i, count);
			}
			if(result == checkNumber){
				return Boolean.toString(true);
			}else{
				return Boolean.toString(false);
			}
			
		}
		catch(Exception e){
			return "Number format error!";
		}
	}


	

}
