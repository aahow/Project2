package examTime;

public class Questions {
	
	public String userInput; //used to track input from user
	
	public int qNumber; // Used to track amount of questions given
	
	public String question; // duh..
	
	public Questions() {
		question = "";
		userInput = "";
		qNumber = 0;
		
	}
	

	public Questions(String question, String userInput, int qNumber) {
		this.question = question;
		this.userInput = userInput;
		this.qNumber = qNumber;
		
	}
	public String getUserInput() {
		return userInput;
	}

	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}

	public int getqNumber() {
		return qNumber;
	}

	public void setqNumber(int qNumber) {
		this.qNumber = qNumber;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String toString() {
		String quest = this.getQuestion();
		return quest;
	}
}
