// Driver class
public class Main {
    public static void main(String[] args) {
        int a = 10, b = 12;
        
        System.out.println("Before increment:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        
        increment(a, b); // Call to increment method
        
        System.out.println("After increment (no changes shown because in Java, call by value works):");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
    
    public static void increment(int x, int y) {
        x = x + 5; // Increment x by 5
        y = y + 5; // Increment y by 5
    }
}
//output
Before increment:
a: 10
b: 12
After increment (no changes shown because in Java, call by value works):
a: 10
b: 12

