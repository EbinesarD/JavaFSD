package VirtualKey;
import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FilesVirtualKey{
	public static void main(String[] args) {
		
		System.out.println("*******************************");
		System.out.println("Virtual Key ");
		System.out.println("Ebinesar D");
		System.out.println("*******************************");
		optionSelection();
		
	}
	private static void optionSelection()
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1. Retrive files\n2. Business Level Operation Menu\n3. Exit");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");		
		try
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter your option: ");
			int option = s.nextInt();
			s.nextLine();
			if(option==1 || option==2 || option==3)
			{
				switch(option)
				{
				case 1:
				{
					System.out.println("Retrieving files: ");
					File dir = new File("C:\\Users\\ebine\\eclipse-workspace22\\JavaFSD\\src\\VirtualKey");
					if(dir.isDirectory())
					{
						File[] fileList = dir.listFiles();
						Arrays.sort(fileList);
						for(File file:fileList)
						{
							System.out.println(file.getName());
						}
					}
					System.out.println();
					optionSelection();
					break;
				}
				case 2:
				{
					fileHandlingOptions();
					break;
				}
				case 3:
				{
					System.out.println("Exited");
					break;
				}
				}
			}
			else
			{
				System.out.println("Please enter a valid option: ");
				optionSelection();
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Mismatch in the input ");
			System.out.println("Please enter a valid option ");
			optionSelection();
		}	
		catch(Exception e)
		{
			System.out.println("Exception caught ");
			System.out.println("Please enter a valid option ");
			optionSelection();
		}
	}
	private static void fileHandlingOptions()
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("1. Add file\n2. Delete file\n3. Search file\n4. Back");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		try
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter your option: ");
			int option = s.nextInt();
			s.nextLine();
			if(option==1 ||option==2 ||option==3 ||option==4 )
			{
				switch(option)
				{
				case 1:
				{
					try
					{
						System.out.println("Enter the file name to be created: ");
						String fileName = s.next();
						s.nextLine();
						String fileValidation = "^[A-Za-z0-9]+\\.(docx|pdf|csv|xls|txt)$";
						Pattern p = Pattern.compile(fileValidation);
						Matcher m = p.matcher(fileName);
						if(m.matches())
						{
							File file = new File("C:\\Users\\ebine\\eclipse-workspace22\\JavaFSD\\src\\VirtualKey\\"+fileName);
							if(file.createNewFile())
							{
								System.out.println("File created");
							}
							else {
								System.out.println("File already Exists");
							}
							System.out.println("Do you want to write in the file: "+fileName+" [Y/N]");
							String yesOrNo = s.nextLine();
							if(yesOrNo.equalsIgnoreCase("Y"))
							{
								FileWriter  writer= new  FileWriter(file,true);
								System.out.println("Enter the comment:");
								String comment = s.nextLine();
								writer.write(comment);
								writer.close();
								System.out.println("File updated");
							}
							else if(yesOrNo.equalsIgnoreCase("N"))
							{
								fileHandlingOptions();
							}
							else
							{
								fileHandlingOptions();
							}
						}
						else {
							System.out.println("Please enter correct filename with extension");
						}		
					}
					catch(IOException e)
					{
						System.out.println("File not created "+e);
					}
					System.out.println();
					fileHandlingOptions();
					break;
				}
				case 2:
				{
					System.out.println("Enter the file name to be deleted: ");
					String deleteFile = s.next();
					try {
						Path path= Paths.get("C:\\Users\\ebine\\eclipse-workspace22\\JavaFSD\\src\\VirtualKey\\"+deleteFile);
						if(Files.deleteIfExists(path))
							System.out.println("File deleted");
						else
							System.out.println("File Not Found");
					} catch (DirectoryNotEmptyException e) {
						System.out.println("File is not in the Directory");
					}
					catch (IOException e) {
						System.out.println("Can not delete "+e);
					}
					System.out.println();
					fileHandlingOptions();
					break;
				}
				case 3:
				{
					System.out.println("Enter the file name to search: ");
					String searchName = s.next();
					try {
						File f = new File("C:\\Users\\ebine\\eclipse-workspace22\\JavaFSD\\src\\VirtualKey\\"+searchName);
						if(f.exists())
						{
							System.out.println("File exists\nReading the file: "+searchName);
							FileReader reader= new FileReader("C:\\Users\\ebine\\eclipse-workspace22\\JavaFSD\\src\\VirtualKey\\"+searchName);					
							int data;					
							while((data=reader.read())!=-1){
								System.out.print((char)data);
							}
							System.out.println("\n");
							reader.close();
						}
						else
						{
							System.out.println("File doesn't exist");
						}
					}
					catch (Exception e) {
						System.out.println("Can not search "+e);
					}
					System.out.println();
					fileHandlingOptions();
					break;			
				}
				case 4:
				{
					optionSelection();
					break;
				}
				default:
				{
					fileHandlingOptions();
					break;
				}
				}
			}
			else
			{
				System.out.println("Please enter a valid option: ");
				fileHandlingOptions();
			}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Mismatch in the input ");
			System.out.println("Please enter a valid option ");
			optionSelection();
		}			
	}
}
