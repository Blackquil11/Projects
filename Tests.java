public class Tests {
    public static void main(String[] args) {
        double testScore1 = 82.2;
        double testScore2 = 78.9;
        double testScore3 = 99.6;
        double average = (testScore1 + testScore2 + testScore3) / 3;
        System.out.printf("Test score 1: %.1f%n", testScore1);
        System.out.printf("Test score 2: %.1f%n", testScore2);
        System.out.printf("Test score 3: %.1f%n", testScore3);
        System.out.printf("The average of 3 test scores is: %.2f%n", average);
    }
}
