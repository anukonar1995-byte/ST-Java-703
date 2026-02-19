package java_sessions;

public class RecursionExample2 {

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
		RecursionExample2 obj = new RecursionExample2();
		obj.countdown(5);
		 
			
		}

	}


