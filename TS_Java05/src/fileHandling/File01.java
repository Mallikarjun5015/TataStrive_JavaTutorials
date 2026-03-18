package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File01 {

	public static void main(String[] args) throws IOException {

		File file = new File("files01.txt");

		if (file.createNewFile()) { // method
			System.out.println(file.getName()+"File created successfully..");
		} else {
			System.out.println(file.getName()+" File creation Failed....");
		}
		
		
		System.out.println("File exists?: "+file.exists());
		System.out.println("File can read? "+file.canRead());
		System.out.println("File can write?: "+file.canWrite());
		System.out.println("File length: "+file.length());
		System.out.println("File name: "+file.getName());
		System.out.println("File absolute path: "+file.getAbsolutePath());
		System.out.println("File  "+file.getTotalSpace());
		System.out.println("File "+file.getUsableSpace());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.isHidden());
//		FileOutputStream fos = new FileOutputStream("image.png"); // constructor
//		System.out.println(fos);
//		
//		Files.write(Paths.get("files02.txt"),"".getBytes());
//		System.out.println("File created successfully..");
		
		
		
//		Files.write(Path.of("files02.txt"), "".getBytes());
//        System.out.println("File written successfully!");
	}

}
