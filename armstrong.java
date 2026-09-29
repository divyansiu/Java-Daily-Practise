import java.util.Scanner ;

public class armstrong{
    public static void main (String[] args){
        /*
        digit
        lastdigit
        sum <- lastdigit^digit
        */
       Scanner in = new Scanner(System.in);
       System.out.print("Enter Number to Check Armstrong : ");
       int num = in.nextInt();
       int original = num ;
       int count = 0, digit = 0, sum = 0 ;
       while(num > 0){
        num /= 10 ;
        count ++ ;
       }
       int temp = 1;
       num = original ;
       while(num > 0){
        digit = num % 10 ;
        for (int i = 1 ; i <= count ; i ++){
            temp *= digit ;
        }
        sum += temp ;
        temp = 1 ;
        num /= 10 ;
       }
       if (original == sum ){
        System.out.println("Given number is an Armstrong number.");
       }else{
        System.out.println("Given number is not an Armstrong number.");
       }
    }
}