package com.dtb.javatestes.arcade.smoothsailing;

public class CommonCharacterCount {
	/**
	 * num fui eu
	 * */
	
	public static void main(String[] args) {
		String s1 = "zzzz", s2 = "zzzzzzz";
		System.out.println(commonCharacterCount(s1, s2));
	}
	static int commonCharacterCount(String s1, String s2) {
	    int[] a = new int[26];
	    int[] b = new int[26];
	    for (char c: s1.toCharArray())
	        a[c - 'a']++;
	    for (char c: s2.toCharArray())
	        b[c - 'a']++;
	    int s = 0;
	    for (int i = 0; i < 26; ++i) 
	        s +=Math.min(a[i],b[i]);
	    return s;        
	}
}
