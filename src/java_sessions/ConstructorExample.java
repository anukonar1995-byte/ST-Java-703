package java_sessions;

public class ConstructorExample {

	String name;
	int age;
	//constructor - special method used to initialize the state of an object // constructor name
	ConstructorExample(){
		name ="Viraj";
		age = 24;
		System.out.println(name + "" + age);
		
		
	}
	
	public static void main(String[]args) {
		ConstructorExample obj = new ConstructorExample();
	}

}
