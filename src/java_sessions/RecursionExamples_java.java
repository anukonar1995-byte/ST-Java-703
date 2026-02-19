package java_sessions;

public class RecursionExamples_java {

	
	void countdown(int num) {
		if(num == 0) {
			System.out.println("Countdown completed");
			return;
		}
		System.out.println(num);
		num--;
		countdown(num);
		
			
		}
	

	public static void main (String [] args) {
		RecursionExample obj = new RecursionExample();
		obj.countdown(5);
		 
			
		}

	}

