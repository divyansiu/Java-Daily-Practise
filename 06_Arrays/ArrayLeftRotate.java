import java.util.Scanner;

/**
 * ArrayLeftRotate
 */
public class ArrayLeftRotate {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the Array : ");
        int n = in.nextInt();
        
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter Value in Array : ");
            arr[i]=in.nextInt();
        }

        System.out.println();
        System.out.print("Initial Array : ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]);
            if(i!=n-1){
                System.out.print(",");
            }
        }

        int temp = arr[0];

        for(int i = 0 ; i < n-1 ; i++){
            arr[i] = arr[i+1];
        }

        arr[n-1] = temp ;
        System.out.println();
        System.out.print("Rotated Array : ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i]);
            if(i!=n-1){
                System.out.print(",");
            }
        }in.close();
    }
}