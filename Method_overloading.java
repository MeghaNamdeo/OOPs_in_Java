
//METHOD OVERLOADING
class Addition{
    
    //create constructor 
    public int add(int a,int b)
    {
        int c = a + b;
        return c;
        
        
    }
    public double add(double a, double b)
    {
       double c=a+ b;
        return c;
        
        
    }
     public String add(String s1,String s2)
    {
        String s= s1+s2;
        return s;
        
        
    }
   
    
    
    
}
//driver class
public class Main
{
	public static void main(String[] args) {
	Addition a = new Addition();
		System.out.println("interger sum :"+a.add(100,19));
		System.out.println("double sum:"+a.add(0.9,0.1));
		System.out.println("String concatenate:"+a.add("Megha ","Namdeo"));
	
	}
}//output
interger sum :119
double sum:1.0
String concatenate:Megha Namdeo

