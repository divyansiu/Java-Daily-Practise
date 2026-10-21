/*WAP to accept a no. & print the frequency of each digit but it should be in accending order respect to frequency . */

/*
Input - no
count
temp
digit
frequency
*/
import java.util.Scanner;

/**
 * frequency
 */
public class DigitFrequency {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enetr a number : ");
        int num = in.nextInt();
        int original = num, temp = 0, digit, count = 0, frequency = 0;
        temp = num ;
        while(temp > 0){
            temp /= 10 ;
            count++;
        }
        temp = original ;
        // int[][] arr = new int[2][count];
        // for(int y = count-1 ; y >= 0 ;y--){
        //     arr[0][y]=temp % 10;
        //     temp /= 10 ;
        // }
        temp = original ;
        while(count > 0){
        digit = temp % 10 ;
        System.out.print(digit+"->");
        for(int i  = 1 ; i<=count ; i++){
            if(digit == num % 10){
                frequency ++ ;
            }
            num /= 10 ;
            // arr[1][i-1] = frequency ;
        }
        System.out.println(frequency);
        temp /= 10 ;
        count-- ;
    }
    temp = original ;
    while(temp > 0){
            temp /= 10 ;
            count++;
        }
    // for(int x = 0 ; x < count ; x++){
    //     for(int y = 0 ; y < count ; y++){
    //         System.out.println(arr[x][y]);
    //     }
    // }
in.close();
    }
}