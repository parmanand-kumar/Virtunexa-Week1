package quiz;

import java.util.Scanner;

public class MathQuiz {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int score = 0;
		boolean playAgain = true;
		
		while(playAgain) {
			int totalQuiz = 0;
			boolean valid = true;
			System.out.println("Enter the number you want in this QUIZ:");
			while(valid) {
				try {
					totalQuiz = Integer.parseInt(in.nextLine());
					valid = false;
				}
				catch(NumberFormatException num) {
					System.out.println("Enter the Valid Number:");
				}
			}
			
			
			for(int i=0; i<totalQuiz; i++) {
				RandomMathProblem problem = new RandomMathProblem();
				System.out.println("Question"+ i +": " + problem.getQuestion());
				int userAnswer = 0;
				boolean validInput = true;
				
				while(validInput) {
					try {
						System.out.print("Give Your Answer: ");
						userAnswer = Integer.parseInt(in.nextLine());
						validInput = false;
					}
					catch(NumberFormatException num) {
						System.out.println("Please Enter a valid number");
					}
				}
				if(userAnswer == problem.getAnswer()) {
					System.out.println("Correct!");
					score++;
				} else {
					System.out.println("Incorrect. The Correct answer is: "+problem.getAnswer());
				}
				System.out.println();
			}
			System.out.println("Quiz Finised");
			System.out.println("Your Score: "+ score + "/" + totalQuiz);
			
			System.out.println("Do You Want To Play Again? Yes | No");
			String Res = in.nextLine().trim().toLowerCase();
			if(!Res.equalsIgnoreCase("yes")) {
				playAgain = false;
				System.out.println("Thanks For Playing!");
			}
		}
		in.close();
	}
}