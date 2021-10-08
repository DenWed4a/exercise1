package by.epam.exercise1;

public class Task01 {

	public static void main(String[] args) {
		 int number = 1221;
		 boolean answer = false;
		 int firstNumber;
		 int secondNumber;
		 int thirdNumber;
		 int fourthNumber;
		 
		 fourthNumber = number%10;
		 number = number / 10;
		 thirdNumber = number%10;
		 number = number / 10;
		 secondNumber = number%10;
		 number = number / 10;
		 firstNumber = number%10;
		 number = number / 10;
		 
		 if ((firstNumber + secondNumber) == (thirdNumber + fourthNumber) ) {
			 answer = true;
		 }
		 
		 System.out.println(answer);

	}

}
