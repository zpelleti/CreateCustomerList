package WriteCustomerList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteCustomerList {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		String file = "CustomerList.txt";
		
		int choice = -1;
		
	while ( choice != 5) {                //> 0 && choice < 5) {
		System.out.println("PLease select an option");
		System.out.println("1: Add customer");
		System.out.println("2: Display file");
		System.out.println("3: Search by ID");
		System.out.println("4: Press 0 to Exit");
		
		choice = sc.nextInt();
		//scan.nextLine();
		
		switch(choice) {
		
		case 1:
			write();
			break;
		case 2:
			read();
			break;
		case 3:
			search();
			break;
		
		case 4:
			
			System.out.println("Goodbye");
			System.exit(4);
			
		default:
			System.out.println("Please enter a valid choice");
			
		}
	}
}
	public static void write() throws IOException {
		
		/**
		 * STRUGGLE: Start by opening Scanner, create file, open file
		 * 			 FileWriter (create + name) /  
		 * 			 Scanner (take user input)/ 
		 * 			 PrintWriter (write on the file) / 
		 * This method takes user Input (Scanner) , saves it on CustomerList.txt
		 * 
		 */
	
	FileWriter fwClist = new FileWriter("CustomerList.txt", true);
	PrintWriter pwClist = new PrintWriter(fwClist);
	Scanner userIn = new Scanner(System.in);
	
		System.out.println("Enter ID");	
		pwClist.write(userIn.nextInt() + "\t\t");
		userIn.nextLine();
		
		System.out.println("Enter first name");
		pwClist.write(userIn.nextLine() + "\t\t");
		
		System.out.println("Enter last name");
		pwClist.write(userIn.nextLine() + "\t\t");
	
		System.out.println("Enter balance owed");
		pwClist.write(userIn.nextDouble() + "\t\t\n");
		
		
		System.out.println("Writing done");
		
		pwClist.close();
		fwClist.close();
		
	}
	public static void read() throws FileNotFoundException {
		
		File file = new File("CustomerList.txt");
		
		Scanner rFile = new Scanner(file);
		
		
		System.out.println("ID#\t\tFIRST NAME\tLAST NAME\tOWED ");
		/** 
		 * STRUGGLE HERE: to read and print out File: 
		 * use hasNext() to read all lines scanned , inside a while 
		 */
		while(rFile.hasNext()) {
		System.out.println(rFile.nextLine());
		
		}
		rFile.close();
		
		
	}
	public static void search() throws FileNotFoundException {
		/**
		 * STRUGGLE HERE: First open Scanner
		 */
		File file = new File("CustomerList.txt");				
		Scanner sc = new Scanner(file);
		
		//scan id:
		System.out.println("Enter ID ");
		
		String ID = sc.nextLine();
				
		
			
		}
	}

