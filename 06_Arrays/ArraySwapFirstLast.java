import java.util.Scanner;

/**
 * ArraySwapFirstLast
 */
public class ArraySwapFirstLast {

    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the Length of Array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter the Value : ");
            arr[i] = in.nextInt();
        }

        int temp = arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=temp;
        System.out.print("The Swapped Array : ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]);
            if(i!=arr.length-1){
                System.out.print(", ");
            }
        }
    }
}