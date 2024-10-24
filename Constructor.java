class Account{
    private int accId;
    private String name;
    private double balance;
    
    public Account()
    {
        System.out.println("Constructor called ");
    }
    public void showAccount()
    { 
        System.out.println("Account id  :"+accId);
        System.out.println("Account Name : "+name);
        System.out.println("Balance : "+balance);
        
    }
    
}
public class Main
{
	public static void main(String[] args) {
		Account obj=new Account();
		obj.showAccount();
		
		
	}
}
