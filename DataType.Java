public class DataType{
	public static void main(String[] args){
		byte age = 25;
		System.out.printf("You are %d years old%n", age);
		
		short quantity = 30000;
		System.out.printf("I bought %d quantity of phones%n", quantity);
		
		int population = 2025278260;
		System.out.printf("The population in Nigeria is %,d%n", population);
		
		long worldpopulation = 737463767846632L;
		System.out.printf("The world's population is %,d%n", worldpopulation);
		
		float myBalance = 67060742.8672F;
		System.out.printf("My account balance is $%2f%n", myBalance);
		
		double cbnBalance = 355435647753744444.477484;
		System.out.printf("The CBN balance is %.2f%n",cbnBalance);
		
		
	}
}