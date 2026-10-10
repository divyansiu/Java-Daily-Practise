import java.util.Scanner;

/**
 * Perfect_no
 */
public class Perfect_no {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enetr a Number : ");
        int num = in.nextInt();
        int sum=0;
        for(int i = 1 ; i <= num/2 ; i++){
            if(num % i == 0){
                sum += i;
            }
        }
        if(sum == num){
            System.out.println("Enetred Number is a Perfect Number.");
        }else{
            System.out.println("Entered Number is not a Perfect Number.");
        }
    }
}