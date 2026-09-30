import java.util.Scanner;

/**
 * primeno
 */
public class primeno {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        int f = 0 ;
        for (int i=1 ; i<=num ; i++){
            if ( num % i == 0){
                f++;
            }
        }
        if(f==2){
            System.out.println("Given number is a Prime number.");
        }else{
            System.out.println("Given umber is not a prime number.");
        }
    }
}