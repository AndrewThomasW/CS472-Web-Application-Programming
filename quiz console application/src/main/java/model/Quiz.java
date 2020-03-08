package model;

import model.Question;

import java.util.LinkedList;
import java.util.List;

public class Quiz {
    List<Question> questions;
    private int numCorrect = 0;
    private int index = 0;

    public Quiz() {
        questions = new LinkedList<>();
        addQuestions();
    }

    @Override
    public String toString() {
        return "Quiz{" +
                "questions=" + questions +
                ", numCorrect=" + numCorrect +
                ", index=" + index +
                '}';
    }

    public void addQuestions() {
        Question pi = new Question("[3,1,4,1,5,?]", 9);
        Question fibonacci = new Question("[0, 1, 1, 2, 3, ?]", 5);
        Question squares = new Question("[1, 4, 9, 16, 25, ? ]", 36);
        Question odds = new Question("[2, 3, 5, 7, 11, ? ]", 13);
        Question doubles = new Question("[1, 2, 4, 8, 16, ? ]", 32);

        questions.add(pi);
        questions.add(fibonacci);
        questions.add(squares);
        questions.add(odds);
        questions.add(doubles);
    }

    public Integer getNumCorrect() {
        return numCorrect;
    }

    public String getCurrentQuestion() {
        if (index == 0) {
            return questions.get(0).getQuestion();
        } else if (index == 1) {
            return questions.get(1).getQuestion();
        } else if (index == 2) {
            return questions.get(2).getQuestion();
        }else if (index == 3) {
            return questions.get(3).getQuestion();
        }else if (index == 4) {
            return questions.get(4).getQuestion();
        }
        return null;
    }

    public boolean isCorrect(String answer) {

        Integer ans = Integer.parseInt(answer);
        if (index == 0) {
            if (ans == 9) {
                return true;
            }
        } else if (index == 1) {
            if (ans == 5) {
                return true;
            }
        }else if (index == 2){
            if (ans == 36) {
                return true;
            }
        }else if (index == 3){
            if (ans == 13) {
                return true;
            }
        }else{
            if (ans == 32) {
                return true;
            }
        }
        return false;
    }

    public void scoreAnswer() {
        numCorrect += 1;
        index++;
    }

    public Integer getNumQuestions() {
        return questions.size();
    }

    public int getCurrentQuestionIndex() {
        return index;
    }

}
