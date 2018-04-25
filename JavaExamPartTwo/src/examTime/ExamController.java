package examTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamController {
	
	List<ExamInterface> exams = new ArrayList<ExamInterface>();
	int ex = 0;
	
	public static void main(String[] arga) {
		
		ExamController give = new ExamController();
		give.getExams();
		give.makeExam();
		
		List<Answers> answers = give.giveExam();
		
	}
	
	public void getExams() {
		exams.add(new Java());
		exams.add(new Geography());
		
	}

	public void makeExam(List<Questions> question) {
		int e = 1;
		for (ExamInterface exam : exams) {
			System.out.print(e++ +": ");
			exam.examName();
		}
		
		System.out.println("Choose an exam based on the number");
		Scanner scan = new Scanner(System.in);
		ex = scan.nextInt() - 1;
		e++;
		for (Answers answer : getAnswers) {
	}
	
	public List<Answers> giveExam() {
		ExamInterface exam = exams.get(ex); 
		String getQuestions = exam.getQuestions();
		String getAnswers = exam.getAnswers();
		exam.examName();
		List<Questions> question = getQuestions();
		
		return null;
		
	}
}
