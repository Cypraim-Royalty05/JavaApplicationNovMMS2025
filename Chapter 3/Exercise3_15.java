public class Exercise3_15 {
    public static void main(String[] args) {
        //3.15a
		int age = 70;

        if (age >= 65) {
            System.out.println("Age is greater than or equal to 65"); 
        } else {
            System.out.println("Age is less than 65");
			
		//3.15b
        int x = 1, total = 0; 

        while (x <= 10) { 
            total += x; 
            ++x;
        }
        System.out.println("Total is: " + total);
    
		//3.15c
        int x = 1, total = 0;

        while (x <= 100) {
            total += x; 
            ++x;
        }
        System.out.println("Total is: " + total);
  

        int y = 5;

        while (y > 0) { 
            System.out.println(y);
            --y;
        }

        }
    }
}