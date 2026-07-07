import java.util.Scanner;

public class Exercise3_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number (or -1 to quit): ");
        int account = input.nextInt();

        while (account != -1) {
            System.out.print("Enter beginning balance: ");
            int beginningBalance = input.nextInt();

            System.out.print("Enter total of all items charged: ");
            int charges = input.nextInt();

            System.out.print("Enter total of all credits applied: ");
            int credits = input.nextInt();

            System.out.print("Enter allowed credit limit: ");
            int creditLimit = input.nextInt();

            int newBalance = beginningBalance + charges - credits;

            System.out.println("New balance is " + newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded");
            }

            System.out.println(); // Prints a blank line for spacing
            System.out.print("Enter account number (or -1 to quit): ");
            account = input.nextInt();
        }
        
        input.close();
    }
}
