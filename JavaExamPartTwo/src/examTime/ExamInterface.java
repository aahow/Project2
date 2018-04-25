package examTime;

import java.util.List;

public interface ExamInterface {
	
	public String getUserName();
	
	public String getQuestions();
	
	public String getAnswers();
	
	public void examStart(List<Questions> getQuestions, List<Answers> getAnswers);
	
	public float gradeExam(int right, int wrong);
	
	public String examName();
	

}
