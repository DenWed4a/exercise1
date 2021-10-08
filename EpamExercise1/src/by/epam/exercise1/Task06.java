package by.epam.exercise1;

public class Task06 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int min;
		int max;
		int sum;
		
		a = 1;
		b = 2;
		c = 3;

		min = Math.min(a, b);
		min = Math.min(min, c);
		max = Math.max(a, b);
		max = Math.max(max, c);
		sum = min + max;
		
		System.out.println(sum);

	}

}
