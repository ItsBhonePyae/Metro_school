package Java_OOP;
import java.util.Scanner;
	class dw {
	    protected String accountNumber;
	    protected double balance;
	    
	    public dw() {
	    		accountNumber = null;
	    		balance = 0.0; 
	    }
	    
	    /*
	    // Will use this when I want to check my account balance
	    public dw(String accountNumber) {
	    		this.accountNumber = accountNumber;
	    	}
	    */
	    
	    // This is for creating new but it's not gonna be stored
	    public dw(String accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }
	
	    public void deposit(double amount) {
	        balance += amount;
	    }
	
	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	        } else {
	            System.out.println("Error: Insufficient funds.");
	        }
	    }
	
	    public double getBalance() {
	        return balance;
	    }
	}
	
	 class CheckingAccount extends dw {
	    
		 public CheckingAccount(String accountNumber, double balance) {
	    		super(accountNumber,balance);
		 }
	
	        public void withdraw(double amount) {
	        double totalToWithraw = amount ;
	        if (totalToWithraw <= balance) {
	            balance -= totalToWithraw;
	            System.out.println("Withdrew " + amount + ".");
	        } else {
	            System.out.println("Insufficient funds for withdrawal.");
	        }
	    }
	}
	
	public class BankAccount {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.print("Enter Account Number: ");
	        String id = input.nextLine();
	        
	        System.out.print("Enter Starting Balance: ");
	        double startBal = input.nextDouble();
	
	        CheckingAccount myAcc = new CheckingAccount(id, startBal);
	        
	        System.out.print("Enter amount to deposit: ");
	        double depAmt = input.nextDouble();
	        myAcc.deposit(depAmt);
	        System.out.println("New Balance: " + myAcc.getBalance());
	        
	        System.out.print("Enter amount to withdraw: ");
	        double withAmt = input.nextDouble();
	        myAcc.withdraw(withAmt);
	
	        System.out.println("Final Balance: " + myAcc.getBalance());
	        
	        
	    }
	}