package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File06 {

	public static void main(String[] args) throws IOException {
	
		File file = new File("files01.txt") ;
		
		FileReader read = null;
		FileWriter wt = null;
		
		read = new FileReader(file);
		wt = new FileWriter("file02.txt", true);
		
		BufferedReader bfr=null;
		BufferedWriter bft = null;
		
		bfr = new BufferedReader(read);
		bft = new BufferedWriter(wt); 
			
		String data;
		
		while((data=bfr.readLine())!=null) {
			System.out.print(data);
			bft.write(data);
			bft.newLine();
		}
		
		Scanner sc = new Scanner(file);
		
		while(sc.hasNext()) {
			data= sc.nextLine();
			System.out.println("\nUsing Scanner");
			System.out.print(data);
		}
		
		bft.close();

	}

}
