import java.util.Scanner;

public class Exercise3_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;
        int largest = Integer.MIN_VALUE; // Starts at minimum possible integer

        System.out.println("Enter 10 integers to find the largest one:");

        while (counter <= 10) {
            System.out.printf("Enter integer %d: ", counter);
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

            counter++;
        }

        System.out.printf("%nThe largest integer found is: %d%n", largest);

        input.close();
    }
}