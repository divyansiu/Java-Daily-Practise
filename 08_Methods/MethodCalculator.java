import java.util.Scanner;

public class MethodCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = add(6,7), product = multiply(6, 7);
        System.out.println("Sum : "+sum);
        System.out.println("Product : "+product);
        System.out.print("Is sum Even? "+isEven(sum));
        
        
    in.close();
    }

    static int add(int a, int b){
        return a+b;
    }


    static int multiply(int a, int b){
        return a*b;
    }
    
    static boolean isEven(int x){
        if(x%2==0){
            return true;
        }else{
            return false;
        }
    }
}