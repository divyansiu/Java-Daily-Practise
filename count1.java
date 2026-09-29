import java.util.Scanner;

public class count1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer : ");
        int num = in.nextInt();
        int count = 0 ;
        while(num > 0){
            num /= 10 ;
            count ++ ;
        }
        System.out.println("Entered Number has "+count+" Digits.");
    }
}