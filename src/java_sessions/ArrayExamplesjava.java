package java_sessions;

public class ArrayExamplesjava {

	public static void main(String[] args) {
		// int empIDS1 = 12345;
		// int empIDS2 = 67890;
		// int empIDS3 = 54321;
		
		// System.out.println("Employee IDS 1:" + empID3);
		//<datatype>[] arrayName = new <datatype>[size];
		
		//declaring an array to store employee IDs
		int[] empIDS = new int[3];
		empIDS[0] = 12345;
		empIDS[1] = 67890;
		empIDS[2] = 54321;
		{
		
		//for each loop to iterate through the array and print employee IDs
		for(int i: empIDS) {
			System.out.println("Employee ID:" + i);
			
		}
			
	
		}
		}
	}


