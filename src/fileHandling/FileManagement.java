package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileManagement {

	public static void main(String[] args) {
		
		// create this reference of the file name and the path mentioned below
		File objFile = new File("\"C:\\Users\\Vanita\\OneDrive\\Desktop\\New folder\\\"ExcutionLog.log");
		
	try {
		if(objFile.createNewFile()) {
			System.out.println("File created");
		}else {
			System.out.println("File already exists");
			
		  }
		} catch (IOException e) {
			//TODO Auto generated catch block
			System.out.println(e.getMessage());
			
			
		}
	//Create an object to 
		}

	}


