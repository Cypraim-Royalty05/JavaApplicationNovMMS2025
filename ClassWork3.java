import java.util.Scanner;

public class ClassWork3 {

    public static void main(String[] args) {
        findAverage(); 
    }

    public static void findAverage() {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insert the first number: ");
        int num1 = scan.nextInt();
        
        System.out.println("Insert the second number: ");
        int num2 = scan.nextInt();
        
        System.out.println("Insert the third number: ");
        int num3 = scan.nextInt();
        
        int average = (num1 + num2 + num3) / 3;
        
        System.out.println("The Average is: " + average);
         
    }
}