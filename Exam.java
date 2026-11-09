/**
 * Determines the grade for an exam.
 */
public class Exam extends Assessment {
    private int numQuestions;
    private int numMissed;
    private int pointsEach;

    /**
     * Sets the number of questions and questions missed, and calculates the score.
     *
     * @param questions the number of questions on the exam
     * @param missed the number of questions missed
     */
    public Exam(int questions, int missed) {
        numQuestions = questions;
        numMissed = missed;
        pointsEach = 100 / numQuestions;
        setScore(100 - numMissed * pointsEach);
    }

    /**
     * Returns the number of points each question is worth.
     *
     * @return the value of the pointsEach field
     */
    public int getPointsEach() {
        return pointsEach;
    }

    /**
     * Returns the number of questions missed.
     *
     * @return the value of the numMissed field
     */
    public int getNumMissed() {
        return numMissed;
    }
}
