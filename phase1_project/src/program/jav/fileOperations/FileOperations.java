package program.jav.fileOperations;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class FileOperations {
	
	static TreeSet<String> treeset = new TreeSet<String>();
	
	
	//function to add a new file
	void addFile() {
		System.out.println("enter file name to be added");
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		String s2 = "D://pro1//"+s1;
		try {
			File file = new File(s2);
			if(file.createNewFile()) {
				System.out.println("File successfully created");
			}
			else {
				if(file.exists()) {
					System.out.println("file exists, please provide a different file name");
					System.out.println("path: "+file.getPath());
				}
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//function to delete a file
	void removeFile() {
		System.out.println("enter file name to be deleted");
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		int count = 0;
		try {
			File file = new File("D:/pro1");
			for(String f:file.list()) {	         
				if(Pattern.matches(s1,f) == true){
					File toDel = new File("D://pro1/"+f);
					System.out.println(toDel);
					boolean b = toDel.delete();
					if(b == true) {
						System.out.println(f+ " file has been deleted");
						count++;
					}
				}				
				else {
					continue;
				}
	        }
			if(count == 0) {
				System.out.println("File not found");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//function to search for a file
	void searchFile() {
		System.out.println("enter file name to be searched");
		Scanner input = new Scanner(System.in);
		String s1 = "(?i).*"+ input.nextLine()+ ".*";
		//s1 = "(?i).*"+ s1+ ".*";
		try {
			File file = new File("D:/pro1");
			for(String f:file.list()) {	         
				if(Pattern.matches(s1,f) == true){
					System.out.println(f);
				}				
				else {
					continue;
				}
	        }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	void displayFile() {
		try {
			File file = new File("D:/pro1");
			for(String f:file.list()) {
				treeset.add(f);
	         }
			System.out.println(treeset);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOperations obj = new FileOperations();
		Scanner input = new Scanner(System.in);
		System.out.println("welcome to LockedMe.com");
		System.out.println("-----developed by Abhinav Kumar Singh-----");
		int num;
		do {
			System.out.println("Please enter your choice : ");
			System.out.println("1 for adding file");
			System.out.println("2 for deleting file");
			System.out.println("3 for searching file");
			System.out.println("4 for displaying file");
			System.out.println("5 to exit the  program");
			num = input.nextInt();
			switch(num) {
			case 1: obj.addFile();
					break;
			case 2:	obj.removeFile();
					break;
			case 3: obj.searchFile();
					break;
			case 4: obj.displayFile();
					break;
			case 5: System.out.println("thank you for using this program.. bye!!");
					break;
			default: System.out.println("please enter a valid input");
					 break;
			}
		}while(num != 5);
		
	}

}

