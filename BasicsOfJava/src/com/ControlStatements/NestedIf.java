package com.ControlStatements;

public class NestedIf {

	public static void main(String[] args) {
		int num=70;
		if( num < 100 ){ 
			System.out.println("number is less than 100"); 
			if(num > 20){
				System.out.println("number is greater than 50");
			}
		}
	}
}
