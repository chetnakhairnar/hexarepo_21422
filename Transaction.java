public class Transaction
{
	public void deposit(Account acc,double amt)
	{
		acc.setBalance(acc.getBalance()+-amt);
	}
}