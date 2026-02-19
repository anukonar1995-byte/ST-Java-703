package exceptionHandle;

public class ExceptionTypes {

	public static void main(String[] args) {
		// Compile time error - Syntax error 
		//int a = 10;
		//System.out.println(a);
		
		//Runtime error
	//	int[] participantID = {1,2,3,4};
		
	//	for(int i=0;i<=participantID.length;i++) {
	//		System.out.println(participantID[i]);
	//	}
		
	//	System.out.print(a/0);
		
		//Logical error - Infinite loop
		for(int i=0;i<=5;i--) {
			System.out.println(i);
		}
	}

}
