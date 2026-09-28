import java.util.Scanner;

public class loopq4{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        int total = 0 ;
        while(num != 0){
            
            total+=num;
            System.out.print("Enter a number : ");
            num = in.nextInt();
        }
        System.out.println("Total : "+total);
    }
}