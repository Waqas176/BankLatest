package BankSystem;
import java.util.Scanner;
import java.util.*;
public class Bank {
		
	public static void main(String[] args) 
	{
		
		CheckingAccount cobj1 = new CheckingAccount();
		SavingAccount sobj1 =new SavingAccount();

		boolean quitsystem =true;
		int newinput=0;
		int logininput=0;
		int maininput=0;
		int delinput=0;
		
		Scanner scanobj = new Scanner(System.in);  // Creating a Scanner object once
		
	    do {
	    	System.out.println("Choose from the Options given below\n"
				     + "1. Create a new Account \n"
					 + "2. Delete an Account \n" 
					 + "3. Withdraw Money \n"
					 + "4. Deposit Money \n"
					 + "5. Show Account details \n"
					 + "6. Exit \n");
	    	
	    	maininput = scanobj.nextInt();  // Read main user input
	    	
	    	switch(maininput)
	    	{
	    	
	    	case 1://Create a new Account
	    		
	    		System.out.println("1. Create a Checking Account \n"
						 		 + "2. Create a Saving Account \n");
	    		
	    		newinput = scanobj.nextInt();  // Read main user input
	    		
	    		if(newinput==1)
	    		{
	    			
	    			System.out.println("Enter your PIN ");
	    			int Pin = scanobj.nextInt();
	    			scanobj.nextLine();
	    			
	    			System.out.println("Enter your name ");
	    			String namee =scanobj.nextLine();
	    			
	    			System.out.println("Enter your Phone number ");
	    			int Phonenum = scanobj.nextInt();
	    			scanobj.nextLine();
	    			
	    			System.out.println("Enter your Address ");
	    			String Adrress = scanobj.nextLine();
	  
	    			System.out.println("Enter your Starting Balance ");
	    			int bala= scanobj.nextInt();
	    			
	    			cobj1.inputdetails( namee, Pin, Phonenum, Adrress , bala );
	    			
	    		}
	    		else
	    		{
	    			System.out.println("Enter your PIN ");
	    			int Pin = scanobj.nextInt();
	    			scanobj.nextLine();
	    			
	    			System.out.println("Enter your name ");
	    			String namee =scanobj.nextLine();
	    			
	    			System.out.println("Enter your Phone number ");
	    			int Phonenum = scanobj.nextInt();
	    			scanobj.nextLine();
	    			
	    			System.out.println("Enter your Address ");
	    			String Adrress = scanobj.nextLine();
	  
	    			System.out.println("Enter your Starting Balance ");
	    			int bala= scanobj.nextInt();
	    			
	    			sobj1.inputdetails( namee, Pin, Phonenum, Adrress , bala );
	    			
	    		}
	    		break;
	    		
	    	case 2://Delete an account 
	    		
	    		System.out.println("1. Delete a Checking Account \n"
	    					 	 + "2. Delete a Saving Account \n");
	    		
	    		int new22 = scanobj.nextInt();
	    		if(new22==1)
	    		{
	    			
	    			System.out.println("Enter the Pin of the account you want to delete ");
	    			int pintodel= scanobj.nextInt();
	    			cobj1.delete(pintodel);
	    			
	    		}
	    		else
	    		{
	    			System.out.println("Enter the Pin of the account you want to delete ");
	    			int pintodel= scanobj.nextInt();
	    			sobj1.delete(pintodel);
	    		}
		
	    		//newinput = scanobj.nextInt();  // Read main user input
	    		
	    		break;
	    		
	    	case 3:
	    		
	    		System.out.println("Enter the type of account you want to withdraw from ");
	    		System.out.println("1. Checking Account \n"
		 		                 + "2.Saving Account \n");
	    		int in1= scanobj.nextInt();
	    		
	    		if(in1==1)
	    		{
	    			System.out.println("Enter the Pin");
	    			int in5= scanobj.nextInt();
	    			System.out.println("Enter the withdrawal amount ");
	    			int in6= scanobj.nextInt();
	    			
	    			cobj1.withdraw(in5 , in6 );
	    		}
	    		else
	    		{
	    			System.out.println("Enter the Pin");
	    			int in7= scanobj.nextInt();
	    			System.out.println("Enter the withdrawal amount ");
	    			int in8= scanobj.nextInt();
	    			
	    			sobj1.withdraw(in7 , in8 );
	    		}
	    		
	    		break;

	    	case 4:
	    		System.out.println("Enter the type of account you want to deposit to  ");
	    		System.out.println("1. Checking Account \n"
				 		         + "2.Saving Account \n");   	
	    		
	    		int in2= scanobj.nextInt();
	    		if(in2==1)
	    		{
	    			System.out.println("Enter the Pin");
	    			int in9= scanobj.nextInt();
	    			System.out.println("Enter the Deposit amount ");
	    			int in62= scanobj.nextInt();
	    			
	    			cobj1.deposit(in9 , in62 );
	    		}
	    		else
	    		{
	    			System.out.println("Enter the Pin");
	    			int in54= scanobj.nextInt();
	    			System.out.println("Enter the Deposit amount ");
	    			int in65= scanobj.nextInt();
	    			
	    			sobj1.deposit(in54 , in65 );
	    		}
	    		
	    		break;
	    		
	    	case 5:
	    		
	    		System.out.println("Enter the type of account you want to see the details of ");
	    		System.out.println("1. Checking Account \n"
				 		         + "2.Saving Account \n");   	
	    		
	    		int in11= scanobj.nextInt();
	    		if(in11==1)
	    		{
	    			System.out.println("Enter the Pin");
	    			int in9= scanobj.nextInt();
	    			
	    			cobj1.showdetails(in9);
	    		}
	    		else
	    		{
	    			System.out.println("Enter the Pin");
	    			int in54= scanobj.nextInt();
	    			
	    			sobj1.showdetails(in54);
	    		}
	    		
	    		break;
	    	case 6://Exit from your account 
	    		
	    		System.out.println("Thank you for using our services. \n      GoodBye! ");
	    		
	    		break;
	    		
	    	default:
	    		System.out.println("\nYou have entered wrong choice \n");
	    		continue;
	    		
	    	}
	    	
	    }while(maininput!=6);
		
		 
	    
	}
}

