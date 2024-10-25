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



	------------------------------------
	/*static variable: In Java, static members 
(variables and methods) can only be accessed 
using the class name, not through object instances.
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
		Demo.b=80;
	
	

		System.out.println("b : "+Demo.b);
		
	}
}

//output

d1.a : 30
d2.a : 56
d3.a : 89

b : 80

	=======================
	class Employee {
    private int age;
    private String name;
    private static String company = "Amazon"; // All employees belong to Amazon

    // Constructor
    public Employee(int age, String name) {
        this.age = age; // Use 'this' to refer to instance variables
        this.name = name;
    }

    public void display() {
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        System.out.println("Company: " + company);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee(25, "Megha");
        Employee e1 = new Employee(22, "Bhavesh");
        Employee e2 = new Employee(23, "Pratibha");

        e.display();    
        e1.display();
        e2.display();  
    }
}
//ouput
Age: 22
Name: Megha
Company: Amazon
Age: 20
Name: Ram
Company: Amazon
Age: 19
Name: Pratibha
Company: Amazon

