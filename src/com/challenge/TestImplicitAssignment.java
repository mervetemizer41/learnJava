package com.challenge;

public class TestImplicitAssignment{
	
	
	public static String byteToLong(){
		byte b = 56;
		long l = b;
		return Long.toString(l);
	}
	public static void main(String[] args){
		
		System.out.println(byteToLong());
	}
	
}

