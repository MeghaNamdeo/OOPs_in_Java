
//METHOD OVERLOADING
class Addition{
    
    //Different number number parameters
    public int add(int a, int b)
    {
       int  c=a+ b;
        return c;
        
        
    }
    public int add(int a,int b,int d)
    {
        int c = a + b+d;
        return c;
        
        
    }
    
    public int add(int a,int b,int d, int e)
    {
        int c = a + b+d+e;
        return c;
        
        
    }
    
}
//driver class
public class Main
{
	public static void main(String[] args) {
	Addition a = new Addition();
		System.out.println("two integer sum:"+a.add(1,2));
		System.out.println("three integer sum :"+a.add(5,2,3));
		System.out.println("four integer sum : "+a.add(12,23,34,45));
	}
}
//output
two integer sum: 3
three integer sum: 10
four integer sum: 114

