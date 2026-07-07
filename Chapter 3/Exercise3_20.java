import java.util.Scanner;

public class Exercise3_20 {
    pub lic static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int employeeCount = 1;

        while (employeeCount <= 3) {
            System.out.printf("Enter hours worked last week for employee %d: ", employeeCount);
            double hoursWorked = input.nextDouble();

            System.out.printf("Enter hourly rate for employee %d: ", employeeCount);
            double hourlyRate = input.nextDouble();

            double grossPay;

            if (hoursWorked <= 40) {
                grossPay = hoursWorked * hourlyRate;
            } else {
                double regularPay = 40 * hourlyRate;
                double overtimeHours = hoursWorked - 40;
                double overtimePay = overtimeHours * (hourlyRate * 1.5);
                grossPay = regularPay + overtimePay;
            }

            System.out.printf("Gross pay for employee %d is: $%.2f%n%n", employeeCount, grossPay);
            employeeCount++;
        }

        input.close();
    }
}