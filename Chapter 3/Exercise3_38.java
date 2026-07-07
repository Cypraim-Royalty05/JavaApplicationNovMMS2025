import java.util.Scanner;

public class Exercise3_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- Cryptography Engine ---");
        System.out.println("1. Encrypt a 4-digit integer");
        System.out.println("2. Decrypt a 4-digit integer");
        System.out.print("Choose an option (1 or 2): ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter a 4-digit integer to encrypt: ");
            int number = input.nextInt();

            // Extract the 4 digits
            int digit1 = number / 1000;
            int digit2 = (number / 100) % 10;
            int digit3 = (number / 10) % 10;
            int digit4 = number % 10;

            // Apply encryption math: add 7 and get remainder after dividing by 10
            digit1 = (digit1 + 7) % 10;
            digit2 = (digit2 + 7) % 10;
            digit3 = (digit3 + 7) % 10;
            digit4 = (digit4 + 7) % 10;

            // Swap 1st with 3rd, and 2nd with 4th
            int temp1 = digit1;
            digit1 = digit3;
            digit3 = temp1;

            int temp2 = digit2;
            digit2 = digit4;
            digit4 = temp2;

            System.out.printf("Encrypted integer: %d%d%d%d%n", digit1, digit2, digit3, digit4);

        } else if (choice == 2) {
            System.out.print("Enter a 4-digit integer to decrypt: ");
            int encryptedNumber = input.nextInt();

            // Extract the 4 encrypted digits
            int digit1 = encryptedNumber / 1000;
            int digit2 = (encryptedNumber / 100) % 10;
            int digit3 = (encryptedNumber / 10) % 10;
            int digit4 = encryptedNumber % 10;

            // Reverse the swap: 1st with 3rd, and 2nd with 4th
            int temp1 = digit1;
            digit1 = digit3;
            digit3 = temp1;

            int temp2 = digit2;
            digit2 = digit4;
            digit4 = temp2;

            // Reverse the math: if digit < 7, add 10 before subtracting 7
            digit1 = (digit1 < 7) ? (digit1 + 10) - 7 : digit1 - 7;
            digit2 = (digit2 < 7) ? (digit2 + 10) - 7 : digit2 - 7;
            digit3 = (digit3 < 7) ? (digit3 + 10) - 7 : digit3 - 7;
            digit4 = (digit4 < 7) ? (digit4 + 10) - 7 : digit4 - 7;

            System.out.printf("Decrypted original integer: %d%d%d%d%n", digit1, digit2, digit3, digit4);
        } else {
            System.out.println("Invalid option.");
        }

        input.close();
    }
}
