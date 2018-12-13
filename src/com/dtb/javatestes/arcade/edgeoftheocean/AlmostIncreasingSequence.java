package com.dtb.javatestes.arcade.edgeoftheocean;

public class AlmostIncreasingSequence {
	public static void main(String[] args) {
		System.out.println(almostIncreasingSequence(new int[] { 1, 2, 1, 2 }));
	}

	static boolean almostIncreasingSequence(int[] sequence) {
		int flagUsed = 0;
		for (int i = 0; i < sequence.length; i++) {
			if (i + 1 != sequence.length) {
				if (sequence[i + 1] <= sequence[i]) {
					flagUsed++;
				}
				if(i - 1 >=0 && sequence[i] <= sequence[i-1]) {
					flagUsed++;
				}
			}

		}
		if (flagUsed > 1)
			return false;
		return true;
	}

}
