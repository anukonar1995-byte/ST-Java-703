package java_sessions;

public class AccessModExamples {
     //variable name
	 protected String name = "Raj";
	
	protected void printName() {
		System.out.println(name);
		
	}
	
	public static void main(String[] agrs) {
		AccessModExamples obj = new AccessModExamples();
		obj.name = "Rahul";
		obj.printName();
		
	}

}
