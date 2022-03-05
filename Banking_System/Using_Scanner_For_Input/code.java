import java.util.*;
class Banking
{
	int account;
	String name;
	double amount;
	void insert(int a,String b,double c)
	{
		account=a;
		name=b;
		amount=c;
	}
	void deposit(int dep)
	{
		System.out.println();
		amount=amount+dep;
		System.out.println("Balance after depositing Rs."+dep+" is : Rs." +amount);
		System.out.println();
	}
	void withdraw(int withd)
	{
		if(withd<=amount)
		{	
			amount=amount-withd;
			System.out.println("Balance after withdrawing Rs."+withd+" is : Rs." +amount);
			System.out.println();
		}
		else
		{
			System.out.println("Insufficient Balance.." );
		}
	}
	void checkbalance()
	{
		System.out.println("Current Balance is : "+amount );
		System.out.println();
	}
	void display()
	{
		System.out.println("Name : "+name);
	 	System.out.println("Account Number: "+account);
		System.out.println("Amount:"+amount);	
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int num,depot,draw;
		String name1=null;
		double bal;
		Banking obj=new Banking();
		System.out.print("Enter account Number :");
		num=in.nextInt();
		System.out.print("Enter Name :");
		name1=in.next();
		System.out.print("Account Balance is :");
		bal=in.nextDouble();
		obj.insert(num,name1,bal);
		
		System.out.println(" ");
		System.out.print("Enter money to deposit :");
		depot=in.nextInt();
		obj.deposit(depot);

		System.out.print("Enter money to withdraw :");
		draw=in.nextInt();
		obj.withdraw(draw);
                
		System.out.println("Displaying Account Current Balance.. ");
		obj.checkbalance();
		System.out.println(" ");

		System.out.println("Displaying Account Information :");
		obj.display();
	}
}
