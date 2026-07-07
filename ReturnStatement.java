public class ReturnStatement{
	public static void main(String[] args){
		System.out.println("The area of the rectangle is " + areaOfRectangle(7,20));
		System.out.println("The area of the rectangle is " + areaOfRectangle(6,21));
		System.out.println("The area of the rectangle is " + areaOfRectangle(2,43));
		System.out.println("The area of the rectangle is " + areaOfRectangle(4,10));
		System.out.println("The area of the rectangle is " + areaOfRectangle(10,26));
	}
	public static int areaOfRectangle(int length , int breadth){
		int area = length * breadth;
		
		return area;
	}
}