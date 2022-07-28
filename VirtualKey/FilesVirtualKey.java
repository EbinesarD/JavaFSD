package VirtualKey;
import java.util.*;
import java.io.*;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FilesVirtualKey{
	public static void main(String[] args) {
		optionSelection();
		
	}
	private static void optionSelection()
	{
		System.out.println("1. Retrive files\n2. Business Level Operation Menu\n3. Exit");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your option: ");
		int option = s.nextInt();
		switch(option)
		{
		case 1:
		{
			
		}
		case 2:
		{
			fileHandlingOptions();
			break;
		}
		case 3:
		{
			System.out.println("Exiting...");
			break;
		}
		}
	}
	private static void fileHandlingOptions()
	{
		System.out.println("1.Add file\n2. Delete file\n3. Search file\n4. Exit\n");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your option: ");
		int option = s.nextInt();
		switch(option)
		{
		case 1:
		{
			try
			{
				System.out.println("Enter the file name to be created: ");
				String fileName = s.next();
				File file = new File("C:\\Users\\ebine\\eclipse-workspace22\\JavaFSD\\src\\VirtualKey\\"+fileName);
				if(file.createNewFile())
				{
					System.out.println("File created");
				}
				else {
					System.out.println("File already Exists");
				}
				System.out.println("Do you want to write in the file: "+fileName+" [Y/N]");
				String yesOrNo = s.next();
				if(yesOrNo.equalsIgnoreCase("Y"))
				{
					FileWriter  writer= new  FileWriter(file,false);
					System.out.println("Enter the comment: ");
					String comment = s.next();
					writer.write(comment);
					writer.close();
					System.out.println("File updated");
				}
				else if(yesOrNo.equalsIgnoreCase("N"))
				{
					fileHandlingOptions();
				}	
			}
			catch(IOException e)
			{
				System.out.println("File not created");
			}
		}
		case 2:
		{
			System.out.println("Enter the file name to be deleted: ");
			String deleteFile = s.next();
			try {
				Path path= Paths.get("C:\\Users\\ebine\\eclipse-workspace22\\JavaFSD\\src\\VirtualKey\\"+deleteFile);
				if(Files.deleteIfExists(path))
					System.out.println("File  deleted");
				else
					System.out.println("File not Deleted");
			} catch (DirectoryNotEmptyException e) {
				System.out.println("Directory is not empty");
			}
			catch (IOException e) {
				System.out.println("Invalid Permission");
			}
		}
		case 3:
		{
			
		}
		case 4:
		{
			optionSelection();
			break;
		}
		}
	}

}
