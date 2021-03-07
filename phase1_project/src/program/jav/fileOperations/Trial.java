/*
package program.jav.fileOperations;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.TreeSet;
import java.util.regex.Pattern;


public class Trial {
	
	static TreeSet<String> treeset = new TreeSet<String>();
	
	void addFile() {
		System.out.println("enter file name to be added");
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		String s2 = "D://pro1//"+s1;
		try {
			File file = new File(s2);
			if(file.createNewFile()) {
				System.out.println("File created");
			}
			else {
				if(file.exists()) {
					System.out.println("file exists");
					System.out.println("path: "+file.getPath());
				}
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	void removeFile() {
		System.out.println("enter file name to be deleted");
		Scanner input = new Scanner(System.in);
		String s1 = "(?i).*"+ input.nextLine()+ ".*";
		//s1 = "(?i).*"+ s1+ ".*";
		try {
			File file = new File("D:/pro1");
			for(String f:file.list()) {	         
				if(Pattern.matches(s1,f) == true){
					System.out.println(f);
					File toDel = new File("D://pro1/"+f);
					System.out.println(toDel);
					boolean b = toDel.delete();
					if(b == false)
					System.out.println(f+ ".txt file has been deleted");
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
	
	void searchFile() throws fileNotFound {
		System.out.println("enter file name to be searched");
		Scanner input = new Scanner(System.in);
		String s1 = "(?i).*"+ input.nextLine()+ ".*";
		//s1 = "(?i).*"+ s1+ ".*";
		try {
			File file = new File("D:/pro132");
			for(String f:file.list()) {	         
				if(Pattern.matches(s1,f) == true){
					System.out.println("file does exist " +f);
				}				
				else {
					continue;
				}
	        }
		}
		catch(Exception e) {
			throw new fileNotFound("File not found");
		}
	}
	void displayFile() {
		File file = new File("D:/pro1");
		for(String f:file.list()) {
			treeset.add(f);
         }
		System.out.println(treeset);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOperations obj = new FileOperations();
		Scanner input = new Scanner(System.in);
		System.out.println("enter your choice 1 for adding file, 2 for deleting file, 3 for searching file and 4 for displaying file");
		int num = input.nextInt();
		while(num != 0) {
			switch(num) {
			case 1: obj.addFile();
					break;
			case 2:	obj.removeFile();
					break;
			case 3: obj.searchFile();
					break;
			case 4: obj.displayFile();
					break;
			default: System.out.println("please enter a valid input");
					 break;
			}
			System.out.println("enter your choice 1 for adding file, 2 for deleting file, 3 for searching and 4 for displaying file");
			num = input.nextInt();
		}
		
	}

}

public class fileNotFound extends Exception{
	fileNotFound(String s){
		super(s);
	}
}
*/