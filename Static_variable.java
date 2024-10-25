/*static variable: In Java, instance variables have a separate copy for each
object instance, whereas static variables have only one copy shared across 
all instances of the class
*/

class Demo
{
    int a ;
    static int b;
    
}
public class Main
{
	public static void main(String[] args) {
	Demo d1=new Demo();
	Demo d2=new Demo();
	Demo d3=new Demo();
	d1.a=30;
	d2.a=56;
	d3.a=89;
	
	System.out.println("d1.a : "+d1.a);
	System.out.println("d2.a : "+d2.a);
	System.out.println("d3.a : "+d3.a);
	
	System.out.println();
	d1.b=80;
	d2.b=99;
	d3.b=79;
	
	System.out.println("d1.b : "+d1.b);
	System.out.println("d2.b : "+d2.b);
	System.out.println("d3.b : "+d3.b);
	}
}
/*output*/
d1.a : 30
d2.a : 56
d3.a : 89

d1.b : 79
d2.b : 79
d3.b : 79
