import java.util.Scanner;

/**
 * ArrayRotateRight
 */
public class ArrayRotateRight {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Length of the array : ");
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter the Value : ");
            arr[i]=in.nextInt();
        }
        System.out.print("Initial Array : ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]);
            if(i!=n-1){
                System.out.print(", ");
            }
        }
        int temp = arr[arr.length-1];
        for(int i = arr.length-1 ; i > 0 ; i--){
            arr[i] = arr[i-1];
        }
        arr[0]=temp;
        System.out.println();
        System.out.print("Rotated Array : ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]);
            if(i!=n-1){
                System.out.print(", ");
            }
        }in.close();
    }
}