package MyPackage;

public class Student {

	String name;

	Student(String name) {        //Constructor
		this.name = name;
	}

	void learn(Teacher teacher) {              // Association through object
		System.out.println(name + " is learning from " + teacher.name);
	}
	
	public static void main(String[] args) {
		
		Student student = new Student("Sujay");
		Teacher teacher = new Teacher("Mr. Jignesh");
		
		student.learn(teacher);           // Association
	}
}
