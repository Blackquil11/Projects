import java.util.Scanner;

public class Tests {
    // Keeps track of how many scores were entered.
    private int numScores;
    // Stores the calculated average of the test scores.
    private double average;

    public Tests() {
        numScores = 0;
        average = Double.NaN;
    }

    public void getAverage() {
        Scanner keyboard = new Scanner(System.in);
        double sum = 0.0;
        int count = 0;

        System.out.println("Enter test scores. Enter -1 to quit.");
        System.out.print("Enter a score: ");
        double score = keyboard.nextDouble();

        while (score != -1) {
            sum += score;
            count++;
            System.out.print("Enter a score: ");
            score = keyboard.nextDouble();
        }

        numScores = count;
        average = (count == 0) ? Double.NaN : sum / count;
    }

    public int getNumScores() {
        return numScores;
    }

    public double getAverageValue() {
        return average;
    }

    @Override
    public String toString() {
        return "The average of the " + numScores + " scores entered is " + String.format("%.2f", average);
    }
}
