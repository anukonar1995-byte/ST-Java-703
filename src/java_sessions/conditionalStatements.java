package java_sessions;

public class conditionalStatements {

	public static void main(String[] args) {
		int age = 18;
		boolean citizen = true;
		
		if(age >= 18 && citizen) {
			System.out.println("You are eligible to vote.");
		}else {
			System.out.println("You are not eligible to vote." );
			
		}

	float marks = 85.5f;
	
	if(marks >=35 && marks < 60) {
		System.out.println("Grade: Pass Class");
	}else if (marks >60 && marks <75) {
		System.out.println("Grade:First Class");
	}
		
		
		//Nested if -else
		
		int num1 = 15;
		int num2 = 20;
		int num3 = 30;
		
		if(num1 > num2) {
			System.out.println("num1 is greater than num2");
			if(num1 > num3) {
				System.out.println("num1 is the greater");
			}
			else {
				System.out.println("num1 is not the greater ");
			}
		}else {
				System.out.println("num1 is not the greater");
				
				//Switch case is more efficient and cleaner than multiple if-else statements when check if
				String browser = "Chrome";
				
				switch (browser) {
				
				case "Chrome":
					System.out.println("You are using Chrome browser");
					break;
					

			    case "Firefox":
			        System.out.println("You are using Firefox browser");
			        break;

			    case "Edge":
			        System.out.println("You are using Edge browser");
			        break;

			    default:
			        System.out.println("Browser not supported");
			}
				
				
				
				
				
				
			}
		}
	
		
	}


