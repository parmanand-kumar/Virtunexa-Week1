package quiz;

import java.util.Random;

public class RandomMathProblem {
	String question;
	int answer;
	
	public RandomMathProblem() {
		generateProblem();
	}
	
	public void generateProblem() {
		Random rand = new Random();
		int num1 = rand.nextInt(10000);
		int num2 = rand.nextInt(10000);
		int op = rand.nextInt(4);
		
		switch(op) {
			case 0:
				question = num1 + "+" + num2;
				answer = num1 + num2;
				break;
			case 1:
				question = num1 + "-" + num2;
				answer = num1 - num2;
				break;
			case 2:
				question = num1 + "*" + num2;
				answer = num1 * num2;
				break;
			case 3:
//				num1 = rand.nextInt(10000);
				num2 = rand.nextInt(10000)+1;
				question = num1 + "/" + num2;
				answer = num1 / num2;
				break;
		}
	}
	
	public String getQuestion() {
		return question;
	}
	
	public int getAnswer() {
		return answer;
	}
}