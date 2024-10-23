package com.campusdual.classroom;

public class Exercise18 {


	public static int [] createAndInitializeArray(int n) {
		int[] array = new int[n];
		for (int i = 0; i < n; i++){
			array[i] = i + 1;
		}
		return array;
	}


	public static void showInlineArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i > 0){
				System.out.println(" ");
			}
			System.out.println(array[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {

		int n = 5;
		int [] array = createAndInitializeArray(n);
		showInlineArray(array);


	}
}
