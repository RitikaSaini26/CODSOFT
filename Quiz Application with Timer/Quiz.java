import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private List<Question> questions;
    private int currentQuestionIndex;
    private int score;

    public Quiz(List<Question> questions) {
        this.questions = questions;
        this.currentQuestionIndex = 0;
        this.score = 0;
    }

    public Question getCurrentQuestion() {
        return questions.get(currentQuestionIndex);
    }

    public boolean isLastQuestion() {
        return currentQuestionIndex == questions.size() - 1;
    }

    public void submitAnswer(int selectedOptionIndex) {
        if (getCurrentQuestion().getCorrectOptionIndex() == selectedOptionIndex) {
            score++;
        }
        currentQuestionIndex++;
    }

    public int getScore() {
        return score;
    }
}
