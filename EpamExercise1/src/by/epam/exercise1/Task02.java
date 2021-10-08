package by.epam.exercise1;

public class Task02 {
	
	public static void main(String[] args) {
		double a = 1;
		double b = 1;
		double c = 0;
		
		double result;
		
		double temp;
		
		temp = (b + Math.sqrt((Math.pow(b, 2) + 4 * a * c )))/2*a; 
		
		result = temp - Math.pow(a, 3) * c + Math.pow(b, -2);
		
		System.out.println(result);
	}

}
