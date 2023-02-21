package com.challenge.december24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorkingOut{


	public static void learnCheckingEmptyString(){
	
		String readS;
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			//Compiler init error
			/*
			if(readS != null){	
				System.out.println("Provided string is null before readLine:" + readS);
			}*/
			//Compiler init error
			/*
			if(readS.length() == 0){
				System.out.println("Provided string's length is 0 before readLine:" + readS);
			}
			*/
			//Compiler init error
			/*
			if(readS.equals(null)){
				System.out.println("Provided string is null before readLine:" + readS);

			}*/
			readS = reader.readLine();
			
			if(readS != null){	
				System.out.println("Provided string is null after readLine:" + readS);
			}
			if(readS.length() == 0){
				System.out.println("Provided string's length is 0 after readLine:" + readS);
			}
			if(readS.equals(null)){
				System.out.println("Provided string is null after readLine:" + readS);

			}
		}
		catch(IOException ioe){
			ioe.printStackTrace();
		}
	}
	
	public static void learnSwitchCaseWithPrimitiveInteger(){
	
		int n;
		String readS;
		System.out.println("Provide number n:");
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			readS = reader.readLine();
			n = Integer.parseInt(readS);
			switch(n){
				case 0:
				System.out.println("You provided number 0!");
				break;
				case 8:
				System.out.println("You provided number 8!");
				break;
			}
				
		
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	
	}
	
	
	public static void learnSwitchCaseWithString(){
	
		int n;
		String readS;
		System.out.println("Provide a word:");
		try{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			readS = reader.readLine();
			switch(readS){
				case "":
				System.out.println("Empty string!");
				break;
				case "merve":
				System.out.println("It's your name!");
				break;
			}
				
			n = Integer.parseInt(readS);
			System.out.println("You provided number:" + n);
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
	
	}
	
	
	public static void main(String[] args)throws IOException{
		learnCheckingEmptyString();
		learnSwitchCaseWithPrimitiveInteger();
		learnSwitchCaseWithString();
	}
	
}
