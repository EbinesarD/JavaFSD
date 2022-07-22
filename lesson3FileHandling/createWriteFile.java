package lesson3FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class createWriteFile {
	public static void createfileusingFileClass() throws IOException
	{
		File file = new File("C:\\Users\\ebine\\eclipse-workspace22\\JavaFSD\\src\\lesson3FileHandling\\testFile1.txt");
		if(file.createNewFile())
		{
			System.out.println("File created");
		}
		else {
			System.out.println("File already Exists");
		}
		
		//write data to that file
		FileWriter  writer= new  FileWriter(file,false);//overWrites file
		//FileWriter  writer= new  FileWriter(file,true);//appends File
		writer.write("Welcome...!");
		writer.close();
	}
	
	public static void createFileUsingOutputStream()  throws IOException
	{
		FileOutputStream out= new FileOutputStream("C:\\Users\\ebine\\eclipse-workspace22\\JavaFSD\\src\\lesson3FileHandling\\testFileOutPutStream.txt");
		String input="Welcome to OutputStream";
		byte array[]=  input.getBytes();
		out.write(array);
		System.out.println("Data Written Successfully");
		out.close();
	}
	
	public static void createFileUsingNIO() throws IOException
	{
		
		Path path=Paths.get("C:\\Users\\ebine\\eclipse-workspace22\\JavaFSD\\src\\lesson3FileHandling\\testFileNIO.txt");
		//write data using file class
		String input="Welcome  to NIO";
		byte array[]=input.getBytes();
		
		Files.write(path, array, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("Data Written Successfully");

		//if you want to write data of list to  files directly
		Path path1=Paths.get("C:\\Users\\ebine\\eclipse-workspace22\\JavaFSD\\src\\lesson3FileHandling\\testFileNIO1.txt");
		//write data  using Files class
		
		List<String> list=Arrays.asList("This  is my first line","This is my secondLine");
		Files.write(path1, list, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		System.out.println("Lines Written Successfully");
		
	}
	
	public static void main(String[] args) {
		try {
			 createfileusingFileClass();
			 createFileUsingOutputStream();
			 createFileUsingNIO();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
