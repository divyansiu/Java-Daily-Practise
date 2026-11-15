import java.util.Scanner;

public class MethodAddition {
    static void add(int x, int y){
        System.out.println("Sum : "+(x+y));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        add(10,12);
        
    in.close();
    }
}