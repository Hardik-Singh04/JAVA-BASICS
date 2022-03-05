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
		System.out.println("Depositing, Please wait..");
		amount=amount+dep;
		System.out.println("Balance after depositing Rs."+dep+" is : Rs." +amount);
		System.out.println();
	}
	void withdraw(int withd)
	{
		if(withd<=amount)
		{	
			System.out.println("Withdrawing, Please wait..");
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
		Banking obj=new Banking();
		obj.insert(1011111,"Hardik",27990.98);
		obj.deposit(2500);
		obj.withdraw(2000);
		obj.checkbalance();
		obj.display();
	}
}
