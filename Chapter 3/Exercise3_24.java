import java.util.Scanner;

public class Exercise3_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int value = 0;

        while (value != 1 && value != 2) {
            System.out.print("Enter a value (1 or 2): ");
            value = input.nextInt();

            if (value != 1 && value != 2) {
                System.out.println("Invalid input! Please try again.");
            }
        }

        System.out.println("Success! Valid input entered: " + value);
        input.close();
    }
}
