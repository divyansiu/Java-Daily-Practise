import java.util.Scanner;

public class MethodGreeting {
    static void Greet(){
        System.out.println("Hello World.");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Greet();
        
    in.close();
    }
}