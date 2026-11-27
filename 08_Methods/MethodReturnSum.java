import java.util.Scanner;

public class MethodReturnSum {
    static int add(int a , int b){
        
        return a+b;
        
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(add(4,5));
        
    in.close();
    }
    
    
    
}