package com.wipro;

public class DecimalToBinary {
	
	public static void convertBinary(int num) {
		while(num>0) {
			System.out.print(num%2);
			num = num/2;
		}
	}

	public static void main(String[] args) {
		
	//	System.out.println(Integer.toBinaryString(123));
		DecimalToBinary.convertBinary(12);
	}

}
