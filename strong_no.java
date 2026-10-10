import java.util.Scanner;

/**
 * strong_no
 */
public class strong_no {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Eneter a number : ");
        int num = in.nextInt();
        int original = num;
        int fact=1, sum=0;
        while(num > 0){
            //Factorial Calculation
            for(int i = 1 ; i <= num%10 ; i++ ){
                fact*=i;
            }
            //adding factorials
            sum+=fact;
            //Reinitiolizing fact
            fact=1;
            num/=10;
        }
        if(original == sum){
            System.out.println("Entered Number is a Strong number .");
        }else{
            System.out.println("Entered Number is not a Strong number .");
        }
    }
}