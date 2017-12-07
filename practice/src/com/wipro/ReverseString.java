package com.wipro;

public class ReverseString {
	
	public static String reverseString(String str) {
		String rstr ="";
		char[] arr =str.toCharArray();
		for(int i=str.length()-1;i>=0;i--) {
			rstr = rstr+arr[i];
		}
		return rstr;
	}

	public static void main(String[] args) {
	
		System.out.println(ReverseString.reverseString("hello"));
	}

}
