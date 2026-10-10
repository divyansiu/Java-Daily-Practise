import java.util.Scanner;

/**
 * euclid_division_gcd
 */
public class euclid_division_gcd {  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int a = in.nextInt();
        System.out.print("Enter 1st number : ");
        int b = in.nextInt();
        
        while(b!=0){
            int remainder = a % b;
            a=b;
            b=remainder;
        }
        System.out.println("GCD : "+a);
    }
}