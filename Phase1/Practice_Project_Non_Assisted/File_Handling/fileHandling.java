package Phase1.Practice_Project_Non_Assisted.File_Handling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileHandling {
	public void create() throws IOException
	{
		
		File file = new File("C:\\Users\\ebine\\eclipse-workspace22\\JavaFSD\\src\\Practice-Project Non Assisted\\file1.txt");
		if(file.createNewFile())
		{System.out.println("File created");}
		else {System.out.println("File already exists");}
		FileWriter writer = new FileWriter(file,false);
		writer.write("Welcome to File1");
		writer.append("\nNew line has been appended");
		writer.close();
	}
	public static void read() throws IOException
	{
		FileReader reader = new FileReader("C:\\Users\\ebine\\eclipse-workspace22\\JavaFSD\\src\\Practice-Project Non Assisted\\file1.txt");
		int data;
		while((data=reader.read())!=-1)
		{
			System.out.print((char)data);
		}
		reader.close();
	}
	public static void main(String[] args) {
		fileHandling f = new fileHandling();
		try
		{
			f.create();
			read();
		}
		catch(IOException e)
		{
			System.out.println("File not available");
		}
	}
}
