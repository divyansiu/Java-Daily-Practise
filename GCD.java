// import java.util.Scanner;

// /**
//  * GCD
//  */
// public class GCD {

//     public static void main(String[] args) {
//         Scanner in = new Scanner (System.in);
//         System.out.print("Enter 1st number : ");
//         int num1 = in.nextInt();
//         System.out.print("Enter 2nd Number : ");
//         int num2 = in.nextInt();
//         int temp=0 ;
//         if(num1>num2){
//             for(int i=num1 ; i>=1 ; i--){
//                 if(num1 % i == 0 && num2 % i ==0){
//                     System.out.println("GCD = "+i);
//                 }
//             }
//         }else if(num2>num1){
//             for(int i=num2 ; i>=1 ; i--){
//                 if(num2 % i == 0 && num1 % i == 0){
//                         temp ++ ;
//                     }
//                 if(temp > 0){
//                     break; 
//                 }
//                 }
//             System.out.println("GCD = "+);
//         }else{
//             System.out.println("GCD = "+num1);
//         }
//     }
// }
import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = in.nextInt();

        System.out.print("Enter 2nd number: ");
        int num2 = in.nextInt();

        int limit;

        if (num1 > num2) {
            limit = num1;
        } else {
            limit = num2;
        }

        for (int i = limit; i >= 1; i--) {

            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println("GCD = " + i);
                break;
            }
        }
    }
}