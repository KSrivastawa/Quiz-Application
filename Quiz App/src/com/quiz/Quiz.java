package com.quiz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz {
	
	Scanner sc = new Scanner(System.in);

	public void logic() {
		
		QuizQuestions question1 = new QuizQuestions("Question: Number of primitive data types in Java are? ", "A. 6", "B. 8", "C. 7", "D. 9");
		QuizQuestions question2 = new QuizQuestions("Question: Automatic type conversion is possible in which of the possible cases?", "A. int to long", "B. Byte to int", "C. Long to int", "D. Short to int");
		QuizQuestions question3 = new QuizQuestions("Question: When an array is passed to a method, what does the method receive?", "A. The reference of the array", "B. A copy of the array", "C. Length of the array", "D. Copy of the first element");
		QuizQuestions question4 = new QuizQuestions("Question: Arrays in java are-", "A. Object references", "B. None", "C. Primitive data types", "D. objects");
		QuizQuestions question5 = new QuizQuestions("Question: Identify the keyword among the following that makes a variable belong to a class,\nrather than being defined for each instance of the class.", "A. final", "B. static", "C. volatile", "D. abstract");
		
		Map<QuizQuestions, Character> hmp = new HashMap<>();
		hmp.put(question1, 'B');
		hmp.put(question2, 'A');
		hmp.put(question3, 'A');
		hmp.put(question4, 'D');
		hmp.put(question5, 'B');
		
		int countCorrect = 0;
		int countWrong = 0;
		int percentage = 0;
		
		for(Map.Entry<QuizQuestions, Character> hm: hmp.entrySet()) {
			System.out.println(hm.getKey().getQuestions());
			System.out.println(hm.getKey().getOption1());
			System.out.println(hm.getKey().getOption2());
			System.out.println(hm.getKey().getOption3());
			System.out.println(hm.getKey().getOption4());

			System.out.println("Enter your Answer: ");
			Character ans = sc.next().charAt(0);
			
			if(ans == 'A'||ans == 'B'||ans == 'C'||ans == 'D'||ans == 'a'||ans == 'b'||ans == 'c'||ans == 'd') {
				int cAns = Character.compare(Character.toUpperCase(ans), hm.getValue());
				
				if(cAns == 0) {
					System.out.println("Correct");
					countCorrect++;
				}
				else {
					System.out.println("Wrong");
					countWrong++;
				}
				
			}else {
				System.out.println("Error: you have choosen out of given options\nSorry this question will not evaluate!");
			}
			
		}	
		
		percentage = (100*countCorrect)/hmp.size();
		
		System.out.println("==============Result=============");
		
		System.out.println("Correct Answer: "+countCorrect);
		System.out.println("Wrong Answer: "+countWrong);
		System.out.println("Percentage: "+percentage+"%");
		
		if(percentage<50)System.out.println("Please Improve Your performance!");
		else if(percentage<60 && percentage>=50)System.out.println("Your performance is just Ok!");
		else if(percentage<80 && percentage>=60)System.out.println("Your performance is Good!");
		else System.out.println("Your performance is Very Good!");
	
	}
}
