package bigtimeexam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ExamController {
	
	public static void main(String[] args) {
		
		List<Exam> exams = new ArrayList<Exam>();
		
		//loads the exams.
		exams.add(new Java());
		exams.add(new Geography());
		
		for(Exam e : exams) {
			e.getQuestions();
			e.getAnswers(); 
		}

		int x = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("These are the exams you can take.");
					
	
		for (Exam e : exams) {
			System.out.println(x + ". " + e.getExamName());
			x++; //System.out.println
		}
			
		System.out.println("Please select an exam");
		String eSelect = scanner.next();
			
		exams.get(Integer.parseInt((eSelect.charAt(0) + "")) - 1).giveExam();
		
		scanner.close();

	
	}

}
