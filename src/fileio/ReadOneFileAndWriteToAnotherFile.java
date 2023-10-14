package fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadOneFileAndWriteToAnotherFile {
	
	public static void main(String[] args) {
		
		File orgFile = new File("D:\\Practice Source Code\\FileHandlingTest\\Test.txt");
		
		File newFile = new File("D:\\Practice Source Code\\FileHandlingTest\\TestNew.txt");
		
		FileInputStream orgFileRead = null;
		FileOutputStream newFileWrite = null;
		try {
			orgFileRead = new FileInputStream(orgFile);
			newFileWrite = new FileOutputStream(newFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		int i=0;
		int count = 0;
		try {
			while((i = orgFileRead.read()) != -1) {
					//WRITE TO THE ANOTHER FILE
					newFileWrite.write(i);
					
					//PRINT THE CONSOLE
					System.out.print((char) i);
					
					char c = (char) i;
					if(c == 'R') {
						count++;
					}
			}
			System.out.println("");
			System.out.println("Total Count Of R "+count);
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				orgFileRead.close();
				newFileWrite.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
