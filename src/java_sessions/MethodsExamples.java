package java_sessions;

public class MethodsExamples {

	void login() {
		System.out.println("Enter username: admin");
		System.out.println("Enter password: admin@123");
		System.out.println("Click on login button");
		System.out.println("Login succecsful");
		
	}
	void search(String product )	{
		System.out.println("Enter product name:" + product);
		}
	void search(String product, int rating )	{
		System.out.println("Enter product:" + product);
		System.out.println("Filter rating:" + rating); 
		}
	
	
	void addtocart() {
		System.out.println("Select product: iphone 14");
	}
	
	void logout() {
		System.out.println("Click on logout button");
	}
	
	public static void main(String[] args) {
		//syntax to create object of class
		// <className> objectName = new <className>();
		MethodsExamples obj = new MethodsExamples();
		//obj.login();
		obj.search("watch");
		obj.search("laptop");
		obj.search("rating",12345);

		//obj.addtocart();
		//obj.logout();

	}

}
