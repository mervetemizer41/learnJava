package com.challenge.beginner;

import java.io.IOException;


public class Application{
	
			
	public static void main(String[] args)throws IOException{
		String result;
		switch(args[0].charAt(0)){
			case 'w':
			result = WordReversal.reverseUsingList(args[1]);
			System.out.println(result);
			break;
			case 'n':
			result = NthWordFinder.findNthWord(args[1], Integer.valueOf(args[2]));
			System.out.println(result);
			break;
			case 'c':
			result = WordCounter.countWord(args[1], args[2]);
			System.out.println(result);
			break;
			case 'a':
			result = AnagramChecker.checkIfAnagram(args[1], args[2]);
			System.out.println(result);
			break;
			case 'p':
			result = PangramChecker.checkIfPangram(args[1]);
			System.out.println(result);
			break;
			case 'r':
			result = Integer.toString(NumberReversal.reverseNumber(args[1]));
			System.out.println(result);
			break;
			case 'g':
			result = ArmstrongNumberChecker.checkArmstrongNumber(args[1]);
			System.out.println(result);
			break;
			case 'm':
			result = ProductMaximizer.maximizeProducts(args[1]);
			System.out.println(result);
			break;
			case 'k':
			result = PrimeNumberChecker.checkIfPrime(args[1]);
			System.out.println(result);
			break;
			case 'f':
			result = PrimeFactorLister.listPrimeFactors(args[1]);
			System.out.println(result);
			break;
			
		}
	}	
	
}
