package com.dtb.javatestes.arcade.smoothsailing;

public class IsLuck {
	public static void main(String[] args) {
		System.out.println(isLucky(1230));
	}
	static boolean isLucky(int n) {
		String nS = String.valueOf(n);
		char[] nC = nS.toCharArray();
		int nSize = nS.length();
		int nA = 0;
		int nB = 0;
		for(int i=0; i < nS.length()/2; i++) {
			nA += Integer.valueOf(nC[i]);
		}
		for(int i=nSize/2; i < nSize; i++) {
			nB += Integer.valueOf(nC[i]);
		}
		return nA == nB?true:false;
	}
}
