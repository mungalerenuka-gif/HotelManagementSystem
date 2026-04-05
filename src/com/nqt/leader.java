package com.nqt;

public class leader {
	public static void leaders(int array[]) {
		int n = array.length;
		int leader = array[n - 1];

		for (int i = n - 2; i >= 0; i--) {
			
			if (array[i] > leader) {
				leader = array[i];
				System.out.print(leader + " ");

			}
		}

	}

	public static void main(String[] args) {
		int array[] = { 12, 23, 4, 3, 2, 5, 3, 2, 1 };
		leaders(array);
	}
}
