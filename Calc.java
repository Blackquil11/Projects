import java.util.Scanner;

public class Calc {
    private double num1;
    private double num2;

    public Calc() {
    }

    // Keep prompting until the user enters a finite number.
    public static double readNumericInput(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                if (Double.isFinite(value)) {
                    return value;
                }
            } else {
                // Consume the invalid token so the next prompt can read new input.
                scanner.next();
            }
            System.out.println("Invalid input. Please enter a numeric value.");
        }
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        return num1 / num2;
    }

    @Override
    public String toString() {
        return "Displaying private data fields using toString():\n"
                + "Num1: " + num1 + "\n"
                + "Num2: " + num2;
    }
}
