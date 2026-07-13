import java.util.Scanner;

public class ClassWork5 {

    public static void main(String[] args) {
        calculateSumOfFive(); 
    }

    public static void calculateSumOfFive() {
        Scanner scan = new Scanner(System.in);
        int sum = 0; 
        
        System.out.println("Please enter 5 numbers:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int currentNumber = scan.nextInt();
            
            sum += currentNumber; 
        }
        
        System.out.println("\nThe total sum of the 5 numbers is: " + sum);
		if (sum % 2 == 0){
			System.out.println("The sum is Even.");
		}
		else{
			System.out.println("The sum is Odd.");
		}	
        
        scan.close();
    }
}