import java.util.Scanner;
/**
 * ArrayMinimum
 */
public class ArrayMinimum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of Integer you want in an Array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter the number : ");
            arr[i]=in.nextInt();
        }
        int min = arr[0];
        for(int i = 1 ; i < n ; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.printf("Minimum Number in Array is %d",min);in.close();
    }
}