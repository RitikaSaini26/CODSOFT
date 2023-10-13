public class Question {
    private String question;
    private List<String> options;
    private int correctOptionIndex;
    
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(String question, List<String> options, int correctOptionIndex) {
		super();
		this.question = question;
		this.options = options;
		this.correctOptionIndex = correctOptionIndex;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}
	public int getCorrectOptionIndex() {
		return correctOptionIndex;
	}
	public void setCorrectOptionIndex(int correctOptionIndex) {
		this.correctOptionIndex = correctOptionIndex;
	}


    
}
