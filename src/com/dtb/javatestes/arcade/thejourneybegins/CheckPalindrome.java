package com.dtb.javatestes.arcade.thejourneybegins;

public class CheckPalindrome {
	public static void main(String[] args) {
		System.out.println(checkPalindrome("natan3"));
	}
	static boolean checkPalindrome(String inputString) {
	    return inputString.equals(invertString(inputString));
	}
	static String invertString(String inputString) {
		int inversoLength = inputString.length();
	    char[] inversoChar = new char[inversoLength];
	    char[] stringChar = inputString.toCharArray();
	    for (char c : stringChar) {
			inversoChar[inversoLength -1] = c;
			inversoLength--;
		}
	    return new String (inversoChar);
	}

}
