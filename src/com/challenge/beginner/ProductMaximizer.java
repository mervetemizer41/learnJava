package com.challenge.beginner;

import java.util.List;
import java.util.ArrayList;

public class ProductMaximizer{

	public static String maximizeProducts(String numberArray){
		try{
		
 			int max_i = -1;
 			int max_j = -1;
 			String[] arraySplitted = numberArray.split(",");
			List<Integer> listNumber = new ArrayList<Integer>();
 			for(String a: arraySplitted){
 				listNumber.add(Integer.valueOf(a));
 			}

			int max_product = Integer.MIN_VALUE;
 			
			for(int i = 0; i < listNumber.size(); i++){
				for(int j = i + 1; j < listNumber.size(); j++){
					int product = listNumber.get(i)*listNumber.get(j);
					if(max_product < product){
						max_product = product;
						max_i = i;
						max_j = j;
					}
				}
			}
			return listNumber.get(max_i) +","+listNumber.get(max_j)+","+max_product;
			
		}
		catch(Exception e){
			e.printStackTrace();
			return "Invalid number array!";
		}
	 }
	
	
}
