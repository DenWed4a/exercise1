package by.epam.exercise1;

public class Task07 {

	public static void main(String[] args) {
		int a = 0;
		int b = 6;
		int h = 4;
		double x;
		double result;
		for(int i = a; i <= b; i = i + h) {
			x = i;
			result = Math.pow(Math.sin(x), 2) - Math.cos(2*x);
			System.out.println(x + "|" + result);
		}
		
		
		 

	}

}
