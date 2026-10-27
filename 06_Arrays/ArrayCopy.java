import java.util.Scanner;

/**
 * ArrayCopy
 */
public class ArrayCopy {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Length of array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter Value in array : ");
            arr[i] = in.nextInt();
        }
        int[] copy_arr = new int[arr.length];
        System.out.print("Value in Copied Array : ");
        for(int i = 0 ; i < arr.length ; i++){
            copy_arr[i] = arr [i] ;
            System.out.print(copy_arr[i]+",");
        }in.close();
    }
}