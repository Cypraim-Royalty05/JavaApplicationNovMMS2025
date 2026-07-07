import java.util.Scanner;

public class Exercise3_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        System.out.println("Enter 10 integers to find the two largest ones:");

        while (counter <= 10) {
            System.out.printf("Enter integer %d: ", counter);
            number = input.nextInt();

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                secondLargest = number;
            }

            counter++;
        }

        System.out.printf("%nLargest integer: %d%n", largest);
        System.out.printf("Second largest integer: %d%n", secondLargest);

        input.close();
    }
}
