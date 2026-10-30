import java.util.Scanner;

/**
 * ArrayReverseInPlace
 */
public class ArrayReverseInPlace {

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enetr the Length Of Array : ");
            int n = in.nextInt();

            int[] arr = new int[n];

            for(int i = 0 ; i < n ; i++){
                System.out.print("Enter value for Array : ");
                arr[i] = in.nextInt();
            }
            System.out.print("value in Array before : ");
            for(int i = 0 ; i < n ; i++){
                System.out.print(arr[i]+" ");
            }
            int temp = 0 ;
            for(int i = 0 ; i < arr.length/2 ; i++){
                temp = arr[i];
                arr[i]=arr[arr.length-1-i]; 
                arr[arr.length-1-i]=temp;
            }
            System.out.println();
            System.out.print("value in Array after : ");
            for(int i = 0 ; i < n ; i++){
                System.out.print(arr[i]+" ");
            }in.close();
    }
}


