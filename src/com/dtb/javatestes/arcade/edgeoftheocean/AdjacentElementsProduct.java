package com.dtb.javatestes.arcade.edgeoftheocean;

public class AdjacentElementsProduct {
	public static void main(String[] args) {
		int[] t = new int[] {1,5,3,7,9,11};
		System.out.println(adjacentElementsProduct(t));
	}
	static int adjacentElementsProduct(int[] inputArray) {
		int i = 0;
		int maxProduct = inputArray[i] * inputArray[i+1];
		while(i < inputArray.length - 2){
			System.out.println(maxProduct);
			i++;
			if(inputArray[i]*inputArray[i+1] > maxProduct)
				maxProduct = inputArray[i] * inputArray[i+1];
		}
	    return maxProduct;
	}
}
