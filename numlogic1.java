import java.util.Scanner;

public class numlogic1{
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Positive Integer : ");
        int num = in.nextInt();
        int sum_of_digits = 0 ;
        while (num > 0){
            sum_of_digits += num % 10 ;
            num /= 10 ;
        }
        System.out.println("Sum of Digits = "+sum_of_digits);
    }
}