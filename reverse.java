import java.util.Scanner;

public class reverse{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int num = in.nextInt();
        int reverse = 0 ;
        
        while (num > 0){
            reverse = reverse * 10 + (num % 10) ;
            num /= 10 ;
        }

        System.out.println("Reversed Number = "+reverse);
    }
}