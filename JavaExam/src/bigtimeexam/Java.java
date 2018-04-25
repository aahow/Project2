package bigtimeexam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java implements Exam {

	public List<Questions> question = new ArrayList<Questions>();
	public List<Answers> answers = new ArrayList<Answers>();
	

	@Override
	public String giveExam(List<Questions> question, List<Answers> answers) {
		// TODO Auto-generated method stub
		int test = 0;
		Scanner scan = new Scanner(System.in);

		
		System.out.println("Welcome to the Java quiz, there are four options but only one "
				+ "is the right answer, choose wisely.");
		System.out.println("Type the letter of the answer you believe to be correct, then submit.");
		for (Questions questionN : question) {
			System.out.println(question);
			String userInput = scan.next();
			test++;
			for (Answers answersN : answers ) {
				//if (answer.question)
				
			}
			
			
			
		}
		
		/*
		String input = "";
		
		while (test < question.size() + 1) {
		*/	//System.out.println(x);
	

		//}

		
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
		String question = "JavaMC.txt";
		return question;

	}

	@Override
	public String getAnswers() {
		// TODO Auto-generated method stub
		String answers = "JavaAnswers.txt";
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
		try {
			FileReader fr = new FileReader("JavaChoices");
			BufferedReader br = new BufferedReader(fr);
			
			String currentLine = "";
			String question;
			while((currentLine = br.readLine()) !=null) {
				String[] line = currentLine.split(".");
				question = line[0];
				
				
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}

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
		return "Java";
	}

	@Override
	public String giveExam() {
		// TODO Auto-generated method stub
		return null;
	}

}
