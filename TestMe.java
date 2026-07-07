public class TestMe{
	public static void main(String[] args){
		InstanceMethod test = new InstanceMethod();
		
		System.out.println(test.addNumber(8,45,28));
		System.out.println(StaticMethod.addNumber(90,50,60));
	}
}