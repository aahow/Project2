package bigtimeexam;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Geography implements Exam {

	public List<Questions> question = new ArrayList<Questions>();
	public List<Answers> answers = new ArrayList<Answers>();

	@Override
	public String giveExam() {
		// TODO Auto-generated method stub
		Scanner userIn = null;
		userIn = new Scanner(System.in);
		

		int right = 0;
		int wrong = 0;

		
		System.out.println("Welcome to the Geography quiz, there are four options but only one "
				+ "is the right answer, choose wisely.");
		System.out.println("Type the letter of the answer you believe to be correct, then submit.");
		
		for (Questions q : question) {
			System.out.println(q);
			

		}

		
		return null ;
	}

	@Override
	public String retrieveUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getQuestions() {
		// TODO Auto-generated method stub
		String question = "GeoMC.txt";
		return question;

	}

	@Override
	public String getAnswers() {
		// TODO Auto-generated method stub
		String answers = "GeoAnswers.txt";
		return answers;

	}

	@Override
	public void loadQuestions() {
		// TODO Auto-generated method stub
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("JavaMC.txt"));
			
			while (scanner.hasNextLine()) {
				Questions q = new Questions();
				q.questionSetter(scanner.nextLine());
				question.add(q);
			}

				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				scanner.close();
		}
		return;
	}

	@Override
	public void loadAnswers() {
		// TODO Auto-generated method stub

	}

	@Override
	public float gradeExam(int right, int wrong) {
		// TODO Auto-generated method stub
		int total = right + wrong;
		float score = (100 * right / total);
		return score;
	}

	@Override
	public String getExamName() {
		// TODO Auto-generated method stub
		return "Geography";
	}

	@Override
	public String giveExam(List<Questions> question, List<Answers> answers) {
		// TODO Auto-generated method stub
		return null;
	}

}
