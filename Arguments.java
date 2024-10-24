

class MyMath{
    public void add(int a, int b)
    {
       int  c=a +b;
        System.out.println("Sum is :"+c);
    }
}
//driver class
public class Main
{
	public static void main(String[] args) {
	MyMath a = new MyMath();
	int i=10,j=20;
	a.add(i,j);//argument
	}
}
