package by.epam.exercise1;

public class Task08 {

	public static void main(String[] args) {
		double [] array = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10};
		int k = 2;
		double sum = 0;
		for(int i = 1; i < array.length; i++) {
			if(array[i] % k == 0) {
				sum += array[i];
			}
		}
		System.out.println(sum);
		
		

	}

}
