class Account{
    private int accId;
    private String name;
    private double balance;
    
    
    //parameterized Constructor
     public Account(int id,String s,double b)
    {
        accId = id;
        name = s;
        balance=b;
        System.out.println("Parameterized Constructor called ");
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
		Account obj=new Account(101,"Megha",100000);
		obj.showAccount();
		
		Account obj2=new Account(102,"Pratibha",500000);
		obj2.showAccount();
		
		
	}
}
