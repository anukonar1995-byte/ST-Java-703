package java_sessions;

public class VariablesScopeExamples_java {

	//class level variables/attributes
	String name;
	int age;
	
	void empDetails() {
		name = "Eshaan";
		age = 24;
		System.out.println("Employee name" + name);
		System.out.println("Employee age" + age);// local variables String companyName ="TCS"
		
	}
	void QATeamDetails() {
		System.out.println("QA team member" + name);
	}
	
	public static void main(String{[] args) {
		
		VariablesScopeExamples obj = new VariablesScopeExamples();
		obj.name = "Eshaan"
		
	}
		
		
		

	}

}
