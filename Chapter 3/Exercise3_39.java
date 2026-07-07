public class Exercise3_39 {
    public static void main(String[] args) {
        // Current global estimates for baseline reference
        double population = 8300000000.0; 
        double growthRate = 0.0083; // 0.83% growth rate
        
        double initialPopulation = population;
        int doubleYear = 0;
        boolean doubledFound = false;

        System.out.printf("%-10s %-25s %-25s%n", "Year", "Anticipated Population", "Numerical Increase");
        System.out.println("------------------------------------------------------------------");

        int year = 1;
        while (year <= 75) {
            double increase = population * growthRate;
            population += increase;

            System.out.printf("%-10d %-25.0f %-25.0f%n", year, population, increase);

            if (!doubledFound && population >= (initialPopulation * 2)) {
                doubleYear = year;
                doubledFound = true;
            }

            year++;
        }

        System.out.println("------------------------------------------------------------------");
        if (doubledFound) {
            System.out.printf("The world population will double its current size in Year: %d%n", doubleYear);
        } else {
            System.out.println("The world population does not double within the next 75 years at this growth rate.");
        }
    }
}
