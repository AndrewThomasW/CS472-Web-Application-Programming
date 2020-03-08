import model.Quiz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuizTest {
    Quiz quizUnderTest = new Quiz();

    @Test
    void addQuestions() {
    }

    @Test
    void getNumCorrect() {
        /* should be at first question, answer should be 0 */
        assertEquals(0, quizUnderTest.getNumCorrect());

        quizUnderTest.scoreAnswer(); //should increment the score and the current question number
        assertEquals(1, quizUnderTest.getNumCorrect());
        assertEquals(1, quizUnderTest.getCurrentQuestionIndex());
    }

    @Test
    void getCurrentQuestion() {
    }

    @Test
    void isCorrect() {

        /* should be at first question, answer should be "9" */
        assertTrue(quizUnderTest.isCorrect("9"), "first question answer should be '9'");
    }

    @Test
    void scoreAnswer() {
    }

    @Test
    void getNumQuestions() {
        /* should be at first question, answer should be 5 */
        assertEquals(5, quizUnderTest.getNumQuestions());
    }
}