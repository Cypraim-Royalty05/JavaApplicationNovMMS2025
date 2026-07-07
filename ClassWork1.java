public class ClassWork1{
    public static void main(String[] args){
        Student student1 = new Student("Alex");
		Student student2 = new Student("James");
		Student student3 = new Student("John");
        student1.printName();
    }
}
	public string
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Student Name: " + this.name);
    }
}