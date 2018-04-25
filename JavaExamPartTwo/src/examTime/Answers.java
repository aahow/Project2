package examTime;

public class Answers {
	
	public String answers;
	private String userInput; // Made this private so I can re-use the name.. Because I am lazy..
	private int qNumber;	  // Same thing for this one..
	
	public Answers() {
		answers = "";
		userInput = "";
		qNumber = 0;
		
	}
	
	public boolean validAnswer() {
		
		if (this.answers.equalsIgnoreCase(this.userInput)) {
			return true;
		
		}
		
		else {
			return false;
		}
	}
	
	public Answers(String answers, String userInput, int qNumber) {
		this.answers = answers;
		this.userInput = userInput;
		this.qNumber = 0;
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
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
	
	public String toString() {
		String quest = this.getqNumber() + " You said" + this.getUserInput();
		if(this.validAnswer() ==true) {
			quest += "Correct";
		
		}
		else {
			return quest += "Incorrect";
		}
		return quest;
	
	
	
	}
	

}
