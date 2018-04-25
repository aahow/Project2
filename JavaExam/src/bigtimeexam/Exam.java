package bigtimeexam;

import java.util.List;

public interface Exam {
	
	public String retrieveUser();
	
	public String getExamName();
	
	public String giveExam();
	
	public String getQuestions();
	
	public String getAnswers();
	
	public void loadQuestions();
	
	public void loadAnswers();
	
	public float gradeExam(int right, int wrong);

	String giveExam(List<Questions> question, List<Answers> answers);
	

}
