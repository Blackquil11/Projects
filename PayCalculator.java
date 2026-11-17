import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;

public class PayCalculator {
    public static void main(String[] args) throws IOException {
        Path inputPath = Paths.get("pay.csv");
        Path outputPath = Paths.get("output.csv");

        try (BufferedReader reader = Files.newBufferedReader(inputPath, StandardCharsets.UTF_8);
             BufferedWriter writer = Files.newBufferedWriter(outputPath, StandardCharsets.UTF_8)) {
            writer.write("EmpID,PayRate,HoursWorked,WeeklyPay");
            writer.newLine();

            String line = reader.readLine();
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                lineNumber++;
                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] columns = line.split(",", -1);
                if (columns.length != 3) {
                    throw new IOException("Expected 3 columns in pay.csv at line " + lineNumber);
                }

                String employeeId = columns[0].trim();
                double payRate;
                double hoursWorked;
                try {
                    payRate = Double.parseDouble(columns[1].trim());
                    hoursWorked = Double.parseDouble(columns[2].trim());
                } catch (NumberFormatException e) {
                    throw new IOException("Invalid pay rate or hours in pay.csv at line " + lineNumber, e);
                }

                if (payRate < 0 || hoursWorked < 0) {
                    throw new IOException("Pay rate and hours must not be negative at line " + lineNumber);
                }

                double weeklyPay;
                if (hoursWorked > 40) {
                    weeklyPay = (40 * payRate) + ((hoursWorked - 40) * payRate * 1.5);
                } else {
                    weeklyPay = hoursWorked * payRate;
                }

                String outputLine = employeeId + ","
                        + columns[1].trim() + ","
                        + columns[2].trim() + ","
                        + String.format(Locale.US, "$%.2f", weeklyPay);
                writer.write(outputLine);
                writer.newLine();
            }
        }

        System.out.println("Wrote weekly pay results to " + outputPath);
    }
}
