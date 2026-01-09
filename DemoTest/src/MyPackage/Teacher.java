package MyPackage;

public class Teacher {

	String name;

	Teacher(String name) {      //Constructor
		this.name = name;
	}

	void teach() {
		System.out.println(name + " is teaching");
	}
}
