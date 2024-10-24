
//GETTER SETTER
class Product{
    private int Id;
    private String name;
    private double price;
    
    //SETTER
    public void setId(int id)
    { 
        Id=id;
        
    }
    public void setname(String n)
    { 
        name=n;
        
    }
    public void setPrice(double p)
    { 
        price=p;
        
    }
    //GETTER
    public int getId()
    {
        return Id;
    
    }
    public String getName()
    {
        return name;
    }
    public double getprice()
    {
        return price;
    }
    
    
}
public class Main
{
	public static void main(String[] args) {
		Product p=new Product();
		p.setId(101);
		p.setname("Maggie");
		p.setPrice(23400);
		System.out.println("Product id="+p.getId());
		System.out.println("Product name ="+p.getName());
		System.out.println("Product price ="+p.getprice());
	
	}
}

------------------------------------------------------------

//GETTER SETTER
class Product{
    private int Id;
    private String name;
    private double price;
    
    //SETTER
    public void setId(int id)
    { 
        if(id<=0){
        System.out.println("Id cannot be negative ");
        return ;}
        else
        Id=id;
        
    }
    public void setname(String n)
    { 
        name=n;
        
    }
    public void setPrice(double p)
    { if(p<=0.0)
    {
        System.out.println("Price must be +ve");
        return;
    }
    else
        price=p;
        
    }
    //GETTER
    public int getId()
    {
        return Id;
    
    }
    public String getName()
    {
        return name;
    }
    public double getprice()
    {
        return price;
    }
    
    
}
public class Main
{
	public static void main(String[] args) {
		Product p=new Product();
		p.setId(-01);
		p.setname("Maggie");
		p.setPrice(-3400);
		System.out.println("Product id="+p.getId());
		System.out.println("Product name ="+p.getName());
		System.out.println("Product price ="+p.getprice());
	
	}
}


----------------------------------------------------
//GETTER SETTER
class Product{
    private int Id;
    private String name;
    private double price;
    
    //create constructor 
    public Product(int i,String n,double p)
    {
        Id=i;
        name=n;
        price = p;
        
        
    }
   
    public void setname(String n)
    { 
        name=n;
        
    }
   
    //GETTER
    public int getId()
    {
        return Id;
    
    }
    public String getName()
    {
        return name;
    }
    public double getprice()
    {
        return price;
    }
    
    
}
public class Main
{
	public static void main(String[] args) {
		Product p=new Product(01,"noodles",30);
		System.out.println("Product id="+p.getId());
		System.out.println("Product name ="+p.getName());
		System.out.println("Product price ="+p.getprice());
		p.setname("atta Maggie");
	
		System.out.println("Product id="+p.getId());
		System.out.println("Product name ="+p.getName());
		System.out.println("Product price ="+p.getprice());
	
	}
}


