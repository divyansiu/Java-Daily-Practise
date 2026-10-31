import java.util.Scanner;

/**
 * ArraySumAndAverage
 */
public class ArraySumAndAverage {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of integer you Want in an Array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0 ; i < n ; i++){
            System.out.print("Enter a Number : ");
            arr[i] = in.nextInt();
        }
        //Sum
        int sum=0 ;
        for(int i = 0 ; i < n ; i++){
            sum+=arr[i];
        }
        double avg = (double) sum/n ;
        System.out.println("Sum of Integers in Array = "+sum);
        System.out.println("Average of Integers in Array = "+avg);
        in.close();
    }
}