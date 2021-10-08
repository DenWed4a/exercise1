package by.epam.exercise1;

public class Task04 {

	public static void main(String[] args) {
		boolean answer = false;
		int x = 7;
		int y = 2;
		
		if(y <= 0 && y > -4) {
			if(x <= 5 && x > -5)
				answer = true;
		}if(y >= 0 && y < 5) {
			if(x >= 0 && x < 3) {
				answer = true;
			}
		}
		
		System.out.println(answer);
	}

}
