package com.dtb.javatestes.arcade.edgeoftheocean;

import java.util.Arrays;

public class MakeArrayConsecutive2 {
	public static void main(String[] args) {
		
	}
	public static int toSort(int[] toSort) {
		int x = 0;
		Arrays.sort(toSort);
		for(int i = 0; i < toSort.length - 1 ; i++) {
			if(toSort[i+1] - toSort[i] > 1) {
				x += toSort[i+1] - toSort[i] -1;
			}
		}
		return x;
	}
}
