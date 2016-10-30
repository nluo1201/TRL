package edu.stthomas.gps.seis635.trl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class TRLLauncher {
	
	private static boolean isDone=true;
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		while (isDone) {
			
			
			 
			System.out.println("\n\nWelcome! This is a Text Book Rental Library Application.\nPlease, Select an option\n");
			System.out.println("Type 1:\t\tTo ADD BOOK to inventory.\n");
			System.out.println("Type 2:\t\tTo ADD COPIES of book to inventory.\n");
			System.out.println("Type 3:\t\tTo CHECK OUT a book, enter\n");
			System.out.println("Type 4:\t\tTo CHECK IN a book, enter.\n");
			System.out.println("Type 5:\t\tTo VIEW number of copies of a book in inventory.\n");
			System.out.println("Type 6:\t\tTo VIEW books in inventory.\n");
			System.out.println("Type 7:\t\tTo CANCEL or END transaction.\n");
			String option= sc.nextLine();
			
			
			switch (option) {
			
			case "1": System.out.println("You are adding books to inventory\n");
			break;
			
			case "2": System.out.println("You are adding copys of books to the inventory\n");
			break;
			
			case "3": System.out.println("You are checking out books\n");
			break;
			
			case "4": System.out.println("You are checking books in\n");
			break;
			
			case "5": System.out.println("You are viewing copies of a book in inventory\n");
			break;
			
			case "6": System.out.println("You are viewing books in inventory\n");
			break;
			
			case "7": System.out.println("Application has been shut down.\nThank You !!!"); 
			isDone=false;
			break;
			
			default: System.out.println("You selected a wrong choice; Please select an option from the list below");
						
			}
	
			
		}
		sc.close();
			
			
}
}