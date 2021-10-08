package by.epam.exercise1;

import java.util.Random;

public class Task09 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] array1 = new int[rand.nextInt(25)+1];
		int[] array2 = new int[rand.nextInt(25)+1];
		int k = rand.nextInt(array1.length-1);
		System.out.println("k = " + k);
		
		for(int i = 0; i < array1.length; i++) {
			array1[i] = rand.nextInt(100);
			System.out.printf("%4d", array1[i]);
		}
		System.out.println();
		for(int i = 0; i < array2.length; i++) {
			array2[i] = rand.nextInt(100);
			System.out.printf("%4d", array2[i]);
		}
		

		int[] newArray = new int[array1.length + array2.length];

		for (int i = 0; i < newArray.length; i++) {
			if(i <= k) {
				newArray[i] = array1[i]; 
			} else if (i > k && i <= k+array2.length) {
				newArray[i] = array2[i-k-1];
			} else if (i > k+array2.length) {
				newArray[i] = array1[i - array2.length];
			}
			
		}
		
		System.out.printf("\nдлинна массива%4d\n", newArray.length);
		for(int element : newArray) {
			System.out.printf("%4d", element);
		}

	}

}
