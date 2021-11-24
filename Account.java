package Bank;


//Coding by Tolga BAYRAK

import java.util.Scanner;
public class Account {
	
	// Variables
	
	int balance = 1000;
	int previousTransaction;
	String customerName;
	String customoerID;
	
	
	public Account(String name, String id) {

		this.customerName = name;
		this.customoerID = id;
		
	}
	
	public void Deposit(int deposit) {
		if(deposit != 0) {
			balance = balance + deposit;
			previousTransaction = deposit;
		}
	}
	
	public void Withdraw( int deposit) {
		if(deposit != 0) {
			balance = balance - deposit;
			previousTransaction = -deposit;
		}
	}
	
	public void getPreviousTransaction() {
		if(previousTransaction >0) {
			System.out.println("Deposit : "+ previousTransaction);
			
		}else if(previousTransaction < 0 ) {
			System.out.println("Withdram" + Math.abs(previousTransaction));
		}else {
			System.out.println("No Transaction");
		}
	}
	
	public void Interest(int years) {
		double interestRate = 0.05;
		double newBalance =(balance * interestRate * years) + balance;
		
		System.out.print("After" +" "+ years +" " + "years, you balance will be : "+ newBalance+"$");
	}
	
	public void showMenu() {
		
		char option ='0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome, "+ customerName + "!!");
		System.out.println("Your ID is : " + customoerID + "");
		System.out.println();
		
		System.out.println("What would you like to do ?");
		System.out.println();
		System.out.println("A. Check your balance");
		System.out.println("B. Make a deposit");
		System.out.println("C. Make a withdraw");
		System.out.println("D. View previous transaction");
		System.out.println("E. Calculate interest");
		System.out.println("F. Exit !");
		
	
		do {
			
			System.out.println();
			System.out.println("Enter a option: ");
			char option1 = scanner.next().charAt(0);
			option = Character.toUpperCase(option1);
			System.out.println();
			
			switch(option) {
			
			case 'A':
				System.out.println("=================");
				System.out.println("Balance = $"+ balance );
				System.out.println("=================");
				System.out.println();
				break;
				
			case 'B':
				System.out.println("Enter an amount deposit");
				int myAmount= scanner.nextInt();
				Deposit(myAmount);
				System.out.println();
				break;
				
			case 'C':
				System.out.println("Enter an amount to withdraw: ");
				int myAmount2 = scanner.nextInt();
				Withdraw(myAmount2);
				System.out.println();
				break;
				
			case 'D':
				System.out.println("===================");
				getPreviousTransaction();
				System.out.println("===================");
				System.out.println();
				break;
				
			case 'E':
				System.out.println("Enter how many years of accrued interest:");
				int years = scanner.nextInt();
				
				Interest(years);
				System.out.println();
				break;
				
			case 'F':
				System.out.println("====================");
				break;
				
			default:
				System.out.println("Error: invalid option. Please enter A, B, C, D, E, F");
				
				break;


			}
			
			
		}while(option != 'F');
		System.out.println("Thank you for banking with us!");



	}


}
