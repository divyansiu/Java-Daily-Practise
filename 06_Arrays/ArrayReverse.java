import java.util.Scanner;

/**
 * ArrayReverse
 */
public class ArrayReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Length of Array : ");
        int n = in.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0 ; i<n ; i++){
            System.out.print("Enter Value in array : ");
            arr[i]=in.nextInt();
        }

        for(int i=n-1 ; i>=0 ; i--){
            System.out.printf("arr[%d]=%d\n",i,arr[i]);
        }in.close();
    }
}