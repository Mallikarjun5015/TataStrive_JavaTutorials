package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class File05 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("files01.txt");
		
//		FileInputStream in = null;
//		FileOutputStream out = null;
//		
//		in = new FileInputStream(file);
//		
//		out = new FileOutputStream("files02.txt");
		
//		int c=0;
//		while((c=in.read())!=-1) {
//			System.out.print((char)c);
//			out.write(c);
//		}
//		
//		in.close();
//		out.close();
//		
		
		FileReader read = null;
		FileWriter wt = null;
		
		read = new FileReader(file);
		
		wt = new FileWriter("file02.txt");
		
		int c=0;
		while((c=read.read())!=-1) {
			System.out.print((char)c);
			wt.write(c);
		}
		
		read.close();
		wt.close();
	}

}
