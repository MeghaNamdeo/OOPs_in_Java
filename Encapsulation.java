class Student{
    private int roll;
    private String name;
    private double percentage;
    
    public void setStudent(int r, String s, double p)
    {
        if(r<=0)
           System.out.println("Roll number cannot be negative  ");
        else 
           roll=r;
        name=s;
        percentage=p;
        
    }
    public void showStudent()
    { 
        System.out.println("Roll :"+roll);
        System.out.println("Name : "+name);
        System.out.println("percentage : "+percentage);
        
    }
    
}
public class Main
{
	public static void main(String[] args) {
		Student s;
		s=new Student();
		s.setStudent(-101,"Megha",90.8);
		s.showStudent();
		
		Student p;
		p=new Student();
		p.setStudent(102,"Pratibha",89.8);
		p.showStudent();
	}
}
//output
Roll number cannot be negative
Roll :0
Name : Megha
percentage : 90.8
Roll :102
Name : Pratibha
percentage : 89.8
