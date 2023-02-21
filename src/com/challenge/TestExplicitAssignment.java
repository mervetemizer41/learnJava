package com.challenge;

public class TestExplicitAssignment{
	
	/*
	public static String longToByteDisablebleTo(){
		long l = 130L;
		byte b = (byte)l;
	}
	
	public static String longToByteAbleTo(){
		long l = 56L;
		byte b = (byte)l;
	}
	*/
	public static String floatToShort(){
		float f = 234.56F;
		short s = (short)f;
		return Short.toString(s);
	}
	public static void main(String[] args){
		
		System.out.println(floatToShort());
	}
	
}
