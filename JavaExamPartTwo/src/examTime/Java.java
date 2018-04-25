package examTime;

import java.util.List;
import java.util.Scanner;



public class Java implements ExamInterface{

	
	public String getUserName() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String getName = scan.next();
		System.out.println("Please enter your name");
		getName = scan.next();
		return getName;

	}

	
	public String getQuestions() {
		// TODO Auto-generated method stub
		String questions = "JavaMC.txt";
		return questions;
	}

	
	public String getAnswers() {
		// TODO Auto-generated method stub
		String answers = "JavaAnswers.txt";
		return answers;
	}

	
	public void examStart(List<Questions> getQuestions, List<Answers> getAnswers) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int e = 0;
		
		System.out.println("This is the Java exam, good luck.");
		
		for (Questions questions : getQuestions) {
			System.out.println(questions);
			String userInput = scan.next();
			e++;
			for (Answers answer : getAnswers) {
				if (answer.getqNumber() == e ) {
					answer.setAnswers(userInput);
				}
			}
			
		}
		
	}

	
	public float gradeExam(int right, int wrong) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String examName() {
		// TODO Auto-generated method stub
		return "Java";
	}

}
