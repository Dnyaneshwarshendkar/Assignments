package customException;

public class Account {
	
	private int id;
	private String name;
	private float balance;
	
	public Account()
	{
		
	}
	
	public Account(int id,String name,float balance)
	{
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	
	void withdraw(float amount)
	{
		if(this.balance - amount < 0)
		{
			throw new InsuffBalanceException("Balance is too low");
		}
		catch(InsuffBalanceException e)
		{
			System.out.println(e);
		}
	}
	else
	{
		this.balance-=amount;
		System.out.println("Amount Withdrawn:"+amount);
		System.out.println("current Balance"+this.balance);
		
	}
}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

	
	
	
	public static void main(String[] args) {
		
		Account a1=new Account();
		a1.setid(101);

	}

}
