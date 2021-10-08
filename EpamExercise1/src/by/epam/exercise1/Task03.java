package by.epam.exercise1;

public class Task03 {

	public static void main(String[] args) {
		double a = 3;
		double b = 5;
		double perimeter;
		double square;
		
		perimeter = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)) + a + b;
		square = a*b/2;
		
		System.out.println("Периметр - "+perimeter + "\nПлощадь - " + square);

	}

}
