package by.epam.exercise1;

public class Task05 {

	public static void main(String[] args) {
		double a = 1;
		double b = -2;
		double c = 3;
		double[] array = {a, b, c};
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > 0) {
				array[i] = Math.pow(array[i], 2);
			}else if(array[i] < 0) {
				array[i] = Math.pow(array[i], 4);
			}
		}
		
		a = array[0];
		b = array[1];
		c = array[2];
		System.out.println(a +" "+ b +" "+c);

	}

}
