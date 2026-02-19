package java_sessions;

public class LoopExamples_java {

	public static void main(String[] args) {
		// Do while loop
		int retryAttempt =0;
		do {
			retryAttempt++;//increment by 1 (retryAttempt = retryAttempt +1)
			System.out.println("Retrying test case ececution. Attempt: "+ (retryAttempt));
		}while(retryAttempt < 3);
		
		
		//While loop - condition is checked before the execution of the loop body
		while(retryAttempt <3) {
			retryAttempt++;
			System.out.println("Retrying test case ececution. Attempt: "+ (retryAttempt));
		    }
		    System.out.println("Test case excuation completed.");
		    
		    //For loop - used when the number of iteration is know beforehead
		    for(int retryAttempt1= 0; retryAttempt1 < 3; retryAttempt1++) {
		    	System.out.println("Retrying test case execution. Attempt: " + (retryAttempt1 +1));
		    }
			
		    
		    for(int i=0; i<5; i++ ) {
		    	if(i==2) {
		    		break;
		    	}
		    	System.out.println("Iteration: " + i);
		    }
		    	
		    	for(int i=0; i<5; i++) {
		    		System.out.println("Outer loop iteration:" + i);
		    		for(int j=0; j<5; j++) {
		    			
		    		}
		    }
		
		}
            
	}
	