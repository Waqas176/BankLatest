package BankSystem;
import java.util.*;
import java.text.SimpleDateFormat;

//Parent Class
public class Accounts {

	ArrayList <String> name = new ArrayList <String>();
	ArrayList <Integer> Pin = new ArrayList <Integer>();
	ArrayList <String> Address = new ArrayList <String>();
	ArrayList <Integer> Pnum = new ArrayList <Integer>();
	ArrayList <Integer> bal = new ArrayList <Integer>();
	ArrayList <String> date = new ArrayList <String>();
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	
	
	
	private int acc_num;		//Account number
	protected double balance;	//Balance

	

	//default constructor
	public Accounts()
	{
		
	}
	
	//parameterized constructor
	public Accounts(int accountnumber)
	{
		
	this.acc_num=accountnumber;
	balance=0;
	
	}

	//setter and getter methods
	
	public double getbalance ()
	{
		return this.balance;
	}
	
	public int getaccountnumber()
	{
        return this.acc_num;
    }
	
	public void deposit (int pin, int amount)
	{
		if(Pin.indexOf(pin) != -1)
		{
			int index =Pin.indexOf(pin);
			int balance1 = bal.get(index);
			balance1 += amount;
			bal.set(index, balance1);
		}
	}
	
	public void withdraw(int pin , int amount )
	{
		if(Pin.indexOf(pin) != -1)
		{
			int index =Pin.indexOf(pin);
			int balance1 = bal.get(index);
			if(balance1<amount)
			{
				System.out.println("You donot have sufficient balance in your account " );
			}
			balance1 -= amount;
			bal.set(index, balance1);
		}
	}
	
	public void showdetails(int P)
	{
		
		if(Pin.indexOf(P) != -1);
			
		{
			int index =Pin.indexOf(P);
			System.out.println("Name : " + name.get(index));
			System.out.println("Address : " + Address.get(index));
			System.out.println("Phone Number : " + Pnum.get(index));
			System.out.println("Balance : " + bal.get(index));
			System.out.println("Transaction Time and Date : " + date.get(index));
			System.out.println("\n \n");
			
		}
		
		}
	
	public void transferamount()
	{
		
	}
	
	public void inputdetails(String n, int P, int Pn, String Add , int bala )
	{
		System.out.println(n);
		
		name.add(n);
		Pin.add(P);
		Address.add(Add);
		Pnum.add(Pn);
		Date d1=new Date();
		date.add(formatter.format(d1));
		bal.add(bala);
	}
	
	
	public void delete (int P)
	{
		
		if(Pin.indexOf(P) != -1)
		{
			int index1 =Pin.indexOf(P);
			name.remove(index1);
			Pin.remove(index1);
			Address.remove(index1);
			Pnum.remove(index1);
			date.remove(index1);
			bal.remove(index1);
		}
		
	}
}
