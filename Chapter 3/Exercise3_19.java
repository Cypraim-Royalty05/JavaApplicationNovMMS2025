import java.util.Scanner;

public class Exercise3_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double grossSales = 0.0;
        int itemNumber;

        System.out.println("Item values available:");
        System.out.println("1: $239.99  |  2: $129.75  |  3: $99.95  |  4: $350.89");
        System.out.print("Enter item number sold (or -1 to finish): ");
        itemNumber = input.nextInt();

        while (itemNumber != -1) {
            if (itemNumber == 1) {
                grossSales += 239.99;
            } else if (itemNumber == 2) {
                grossSales += 129.75;
            } else if (itemNumber == 3) {
                grossSales += 99.95;
            } else if (itemNumber == 4) {
                grossSales += 350.89;
            } else {
                System.out.println("Invalid item number entered.");
            }

            System.out.print("Enter item number sold (or -1 to finish): ");
            itemNumber = input.nextInt();
        }

        double earnings = 200.00 + (grossSales * 0.09);

        System.out.printf("%nGross sales last week: $%.2f%n", grossSales);
        System.out.printf("Total salesperson earnings: $%.2f%n", earnings);

        input.close();
    }
}
